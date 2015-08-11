package chapter.six;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Student(){};
	
	public Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;	
	}
	
	public int getTotal(){
		return kor + eng + math;
	}
	
	public float getAverage(){
		float total = (float)this.getTotal();
		total /= 3;
		total = (float) (Math.round(total*10) / 10.0);
		return total;
	}
	
	public String info(){
		String result = "";
		result = this.name +","+String.valueOf(ban) +","+ String.valueOf(no) +","+ String.valueOf(kor) +","+ String.valueOf(eng) +","+ String.valueOf(math) +","+ String.valueOf(this.getTotal()) +","+ String.valueOf(this.getAverage());
		return result;
	}
}
