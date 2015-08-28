#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <dirent.h>
#include <fcntl.h>
#include <time.h>
#include <errno.h>
#include <pthread.h>
#include <sys/stat.h>
#include <sys/types.h>
#include <sys/wait.h>


/* 상수 정의 */
#define MAXLINE		1024
#define MAXARGS		128
#define MAXPATH		1024
#define MAXTHREAD	10

#define MAXBUFF     1024

#define DEFAULT_FILE_MODE	0664
#define DEFAULT_DIR_MODE	0775


/* 전역 변수 정의 */
char prompt[] = "myshell> ";
const char delim[] = " \t\n";
static char perms_buff[30];

/* 전역 변수 선언 */


/* 함수 선언 */
void myshell_error(char *err_msg);
void process_cmd(char *cmdline);
int parse_line(char *cmdline, char **argv);
int builtin_cmd(int argc, char **argv);


// 내장 명령어 처리 함수
int list_files(int argc, char **argv);
int copy_file(int argc, char **argv);
int inner_file_copy(const char* src, const char* dst);
int remove_file(int argc, char **argv);
int move_file(int argc, char **argv);
int change_directory(int argc, char **argv);
int make_directory(int argc, char **argv);
int remove_directory(int argc, char **argv);
int copy_directory(int argc, char **argv);
int concatenate(int argc, char** argv);

int print_working_directory(void);

const char* my_sperms(mode_t mode);

/*
 * main - MyShell's main routine
 */
int main()
{
	char cmdline[MAXLINE];

	/* 명령어 처리 루프: 셸 명령어를 읽고 처리한다. */
	while (1) {
		// 프롬프트 출력
		printf("%s", prompt);
		fflush(stdout);

		// 명령 라인 읽기
		if (fgets(cmdline, MAXLINE, stdin) == NULL) {
			return 1;
		}

		// 명령 라인 처리
		process_cmd(cmdline);

		fflush(stdout);
	}

	/* 프로그램이 도달하지 못한다. */
	return 0;
}


/*
 * process_cmd
 *
 * 명령 라인을 인자 (argument) 배열로 변환한다.
 * 내장 명령 처리 함수를 수행한다.
 * 내장 명령이 아니면 자식 프로세스를 생성하여 지정된 프로그램을 실행한다.
 * 파이프(|)를 사용하는 경우에는 두 개의 자식 프로세스를 생성한다.
 */
void process_cmd(char *cmdline)
{
	int argc;
	char *argv[MAXARGS];

	// 명령 라인을 해석하여 인자 (argument) 배열로 변환한다.
	argc = parse_line(cmdline, argv);
	
    /*
        // 명령 확인용
	int i=0;
	for(i=0; i <argc; i++){
		printf("%s ",argv[i]);
	}
	printf("\n");
    */

	/* 내장 명령 처리 함수를 수행한다. */
	if (builtin_cmd(argc, argv) == 0) {

		// 내장 명령 처리를 완료하고 리턴한다.
		return;
	}
    

	/*
	 * 자식 프로세스를 생성하여 프로그램을 실행한다.
	 */

	// 프로세스 생성


	// 자식 프로세스에서 프로그램 실행


	// 파이프 실행이면 자식 프로세스를 하나 더 생성하여 파이프로 연결


	// foreground 실행이면 자식 프로세스가 종료할 때까지 기다린다.

	return;
}


/*
 * parse_line
 *
 * 명령 라인을 인자(argument) 배열로 변환한다.
 * 인자의 개수(argc)를 리턴한다.
 * 파이프와 백그라운드 실행, 리다이렉션을 해석하고 flag와 관련 변수를 
 *   설정한다.
 */
int parse_line(char *cmdline, char **argv)
{
	// delimiter 문자를 이용하여 cmdline 문자열 분석
    int i=0;
    int argc = 0;
    
    char *token = strtok(cmdline, delim);
    while(token){
        argv[i] = token;
        i++ ;
        token = strtok(NULL, delim);
        
    }
    argc = i;
    return argc;
}



/*
 * builtin_cmd
 *
 * 내장 명령을 수행한다.
 * 내장 명령이 아니면 1을 리턴한다.
 */
int builtin_cmd(int argc, char **argv)
{
    
	// 내장 명령어 문자열과 argv[0]을 비교하여 각각의 처리 함수 호출
	if ( (!strcmp(argv[0], "quit") || (!strcmp(argv[0], "exit")))){
       		exit(0);
	}
    else if(!strcmp(argv[0], "ls") || !strcmp(argv[0], "ll")){
        list_files(argc, argv);
    }
   
    else if(!strcmp(argv[0],"cp")){
        copy_file(argc,  argv);
    }
    else if(!strcmp(argv[0],"mv")){
        move_file(argc,  argv);
    }
    else if(!strcmp(argv[0], "rm")){
        remove_file(argc, argv);
    }
    else if (!strcmp(argv[0], "pwd")){
        print_working_directory();
    }
    else if(!strcmp(argv[0], "mkdir")){
        make_directory(argc,  argv);
    }
    else if(!strcmp(argv[0], "rmdir")){
        remove_directory(argc, argv);
    }
    else if(!strcmp(argv[0], "cd")){
        change_directory(argc,  argv);
    }
    else if(!strcmp(argv[0], "cat")){
        int nResult = concatenate(argc, argv);
        if( nResult == -1) printf("concatenate error\n");
    }


	// 내장 명령어가 아님.
	return 1;
}


/*
 *
 * 내장 명령 처리 함수들
 * argc, argv를 인자로 받는다.
 *
 */
int list_files(int argc, char **argv)
{
   
    DIR *dp;
    struct dirent *d_entry;
    struct stat sb;
    int ret;
    char buff[40];
    time_t t = (time_t)NULL;
    struct tm lt;
    int fd, saved_stdout = 1;
    
    
    //리다이렉션 여부 확인하여 스트림 바꿔주기
    if(argc>1 && !strcmp(argv[1], ">")){
        
        
        fd = creat(argv[2], DEFAULT_FILE_MODE);
        if(fd < 0) return 1;
        
        saved_stdout = dup(1);
        dup2(fd, 1);
        close(fd);
    }
    
    
    dp = opendir(".");
    if (dp == NULL){
        perror("directory open errror\n");
        return 1;
    }
    
    d_entry = readdir(dp);
    if( !strcmp(argv[0], "ls" )){
        while(d_entry != NULL){
            printf("%s\n", d_entry->d_name);
            d_entry = readdir(dp);
        }
    }
    else if( !strcmp(argv[0], "ll") ){
        while( d_entry != NULL){
            ret =stat(d_entry->d_name, &sb);
            if(ret){
                perror("stat");
            return 1;
            }
            
            t = sb.st_atime;
            localtime_r(&t, &lt);
            strftime(buff, sizeof buff, "%b %d %T", &lt);
            
            printf("%10.10s %2hu %5u %3u %8lld %s %s \n", my_sperms(sb.st_mode), sb.st_nlink, sb.st_uid, sb.st_gid, sb.st_size, buff,  d_entry->d_name);
            d_entry = readdir(dp);
        }
    }
    closedir(dp);
    
    
    if(argc>1 && !strcmp(argv[1], ">")){
        dup2(saved_stdout, 1);
    }
    
	return 0;
}


int copy_file(int argc, char **argv)
{
    int nResult = inner_file_copy(argv[1], argv[2]);
    
    if(nResult == -1){
        perror("파일 복사 실패\n");
    }
	return 0;
}

int move_file(int argc, char **argv){
    int nResult = rename( argv[1], argv[2] );
    
    if( nResult == -1 )
    {
        perror( "이름 변경 실패 - \n" );
    }
    
    return 0;
}
int remove_file(int argc, char **argv)
{
    int nResult = remove(argv[1] );
    
    if( nResult == -1 )
    {
        perror( "파일 삭제 실패\n" );
    }

	return 0;
}


int change_directory(int argc, char **argv)
{
    int nResult = chdir(argv[1]);
    printf("!!%s\n", argv[1]);
    if( nResult == -1 ){
        printf("해당 이름의 디렉토리가 없습니다.\n");
    };
	return 0;
}

int print_working_directory(void)
{
    char buff[MAXBUFF];
    getcwd(buff,MAXBUFF);
    printf("%s \n", buff);
	return 0;
}


int make_directory(int argc, char **argv)
{
    int nResult = mkdir(argv[1], DEFAULT_DIR_MODE );
    
    if( nResult == -1 )
    {
        perror( "폴더 생성 실패 - 폴더가 이미 있거나 부정확함\n" );
        printf( "errorno : %d", errno );
    }

	return 0;
}


int remove_directory(int argc, char **argv)
{
    int nResult = rmdir(argv[1]);
   
    if( nResult == -1 )
    {
        perror( "폴더 삭제 실패 - 폴더 안에 파일이 있거나 사용중\n" );
        printf( "errorno : %d", errno );
    }

	return 0;
}

//3단계 구현 목표
int copy_directory(int argc, char **argv)
{
    
	return 0;
}

                        
int inner_file_copy(const char* src, const char* dst){
    FILE *in, *out;
    char* buf;
    size_t len;
    

    if ((in  = fopen(src, "rb")) == NULL) return -1; // 원본 파일 열기
    if ((out = fopen(dst, "wb")) == NULL) { fclose(in); return -1; } // 대상 파일 만들기
    
    if ((buf = (char *) malloc(MAXBUFF)) == NULL) { fclose(in); fclose(out); return 10; } // 버퍼 메모리 할당
    
    while ( (len = fread(buf, sizeof(char), sizeof(buf), in)) != NULL )
        if (fwrite(buf, sizeof(char), len, out) == 0) {
            fclose(in); fclose(out);
            free(buf);
            unlink(dst); // 에러난 파일 지우고 종료
            return -1;
        }
    
    fclose(in); fclose(out);
    free(buf); // 메모리 할당 해제
    
    return 0;
}


int concatenate(int argc, char** argv){
    
    int in_fd, rd_count, standard_out = 1;
    char buffer[MAXBUFF];
    
    if(argc > 2) return -1;
    
    if( (in_fd = open(argv[1] , O_RDONLY))< 0)
        return -1;
   
    while(1){
        if(  (rd_count = read(in_fd, buffer, 2048) ) <= 0  )
            break;
        if( (write(standard_out, buffer, rd_count) <= 0 ))
           return -1;
    }
    
    
    if( rd_count < 0 )  return -1;
    close(in_fd);

    
    return 0;
}


const char* my_sperms(mode_t mode)
{
    char ftype = '?';
    if (S_ISREG(mode)) ftype = '-';
    if (S_ISLNK(mode)) ftype = 'l';
    if (S_ISDIR(mode)) ftype = 'd';
    if (S_ISBLK(mode)) ftype = 'b';
    if (S_ISCHR(mode)) ftype = 'c';
    if (S_ISFIFO(mode)) ftype = '|';
    //if (S_ISINDEX(mode)) ftype = 'i';
    sprintf(perms_buff, "%c%c%c%c%c%c%c%c%c%c %c%c%c",
            ftype,
            mode & S_IRUSR ? 'r' : '-',
            mode & S_IWUSR ? 'w' : '-',
            mode & S_IXUSR ? 'x' : '-',
            mode & S_IRGRP ? 'r' : '-',
            mode & S_IWGRP ? 'w' : '-',
            mode & S_IXGRP ? 'x' : '-',
            mode & S_IROTH ? 'r' : '-',
            mode & S_IWOTH ? 'w' : '-',
            mode & S_IXOTH ? 'x' : '-',
            mode & S_ISUID ? 'U' : '-', 
            mode & S_ISGID ? 'G' : '-', 
            mode & S_ISVTX ? 'S' : '-'); 
    return (const char *)perms_buff; 
}
