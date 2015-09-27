#include <gl/glut.h>
#include <windows.h>
#include <math.h>

#define GL_PI 3.1415f

static GLfloat xRot = 0.0f;
static GLfloat yRot = 0.0f;

static GLfloat zDistance = 0.0f;		///ADD


void SetupRC()
{
	GLfloat amb[] = { 0.1f, 0.1f, 0.1f, 1.0f };
	GLfloat diff[] = { 0.4f, 0.4f, 0.4f, 1.0f };

	glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
	glEnable(GL_DEPTH_TEST);
	glFrontFace(GL_CCW);
	glEnable(GL_CULL_FACE);

	glEnable(GL_LIGHTING);

	//glLightModelfv(GL_LIGHT_MODEL_AMBIENT, amb);
	

	glEnable(GL_LIGHTING);

	//glLightModelfv(GL_LIGHT_MODEL_AMBIENT, amb);
	glLightfv(GL_LIGHT0, GL_AMBIENT, amb);
	glLightfv(GL_LIGHT0, GL_DIFFUSE, diff);
	glEnable(GL_LIGHT0);

	glEnable(GL_COLOR_MATERIAL);
	glColorMaterial(GL_FRONT, GL_AMBIENT_AND_DIFFUSE);


}

void TimerFunc(int value)
{
	glutPostRedisplay();
	glutTimerFunc(3000, TimerFunc, 1);
}

void ChangeSize(int w, int h)
{
	GLfloat nRange = 100.0f;

	glViewport(0, 0, w, h);

	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();

	if (w <= h)
		glOrtho(-nRange, nRange, -nRange*h / w, nRange*h / w, -nRange*2.0f, nRange*2.0f);
	else
		glOrtho(-nRange*w / h, nRange*w / h, -nRange, nRange, -nRange*2.0f, nRange*2.0f);


	glMatrixMode(GL_MODELVIEW);
	glLoadIdentity();
}

void ChangeSize2(int w, int h)
{
	GLfloat fAspect;
	GLfloat lightPos[] = { -50.f, 50.0f, 15, 100.0f, 1.0f };
	glViewport(0, 0, w, h);

	fAspect = (GLfloat)w / (GLfloat)h;
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();

	gluPerspective(60.0f, fAspect, 1.0f, 500.0f);

	glMatrixMode(GL_MODELVIEW);
	glLoadIdentity();

	glLightfv(GL_LIGHT0, GL_POSITION, lightPos);
	glTranslatef(0.0f, 0.0f, -200.0f);
}
void RenderScene()
{
	static GLfloat fElect1 = 0.0f;
	glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

	glMatrixMode(GL_MODELVIEW);
	glLoadIdentity();
	glTranslatef(0.0f, 0.0f, -100.0f);
	glColor3ub(255, 0, 0);
	glutSolidSphere(8.0f, 15, 15);

	glPushMatrix();
	glRotatef(fElect1, 0.0f, 1.0f, 0.0f);
	glTranslatef(90.0f, 0.0f, 0.0f);
	glColor3ub(0, 0, 255);
	glutSolidSphere(5.0f, 15, 15);
	//glPopMatrix();

	/*
	glPushMatrix();
	glRotatef(fElect1, 0.0f, 1.0f, 0.0f);
	glTranslatef(90.0f, 0.0f, 0.0f);
	glColor3ub(255, 255, 0);
	glutSolidSphere(6.0f, 15, 15);
	glPopMatrix();
	*/
	
	
	glPushMatrix();
	glColor3ub(255,255,0);
	glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
	glRotatef(fElect1, 0.0f, 1.0f, 0.0f);
	glTranslatef(10.0f, 0.0f, 0.0f);
	glutSolidSphere(3.0f, 15, 15);
	glPopMatrix();
	
	/*
	glPushMatrix();
	glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
	glRotatef(fElect1, 0.0f, 1.0f, 0.0f);
	glTranslatef(0.0f, 0.0f, 60.0f);
	glutSolidSphere(6.0f, 15, 15);
	*/
	glPopMatrix();
	
	fElect1 += 10.0f;
	if (fElect1 > 360.0f)
		fElect1 = 0.0f;

	glutSwapBuffers();
}

int main(void)
{
	glutInitDisplayMode(GLUT_DOUBLE | GLUT_RGB | GLUT_DEPTH);
	glutInitWindowSize(512, 512);
	glutInitWindowPosition(0, 0);
	glutCreateWindow("Atom");

	glutReshapeFunc(ChangeSize2);
	glutTimerFunc(33, TimerFunc, 1);
	//glutSpecialFunc(ContorolKey);
	glutDisplayFunc(RenderScene);
	SetupRC();
	glutMainLoop();
}