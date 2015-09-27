#include <GL/glut.h>
#include <Windows.h>
#include <math.h>
#include <stdio.h>

#define GL_PI 3.1415f
static GLfloat xRot = 0.0f;
static GLfloat yRot = 0.0f;
/*
bool iDepth = FALSE;
bool iOutline = FALSE;
bool iCull = FALSE;
*/
void SetupRC(void)
{
	glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
	glColor3f(0.0f, 1.0f, 0.0f);
	glShadeModel(GL_FLAT);
	glFrontFace(GL_CW);
	//glEnable(GL_CULL_FACE);
	glEnable(GL_DEPTH_TEST);
}


void RenderScene(void)
{
	GLfloat x = 0.f, y = 0.f, z = 0.f, angle = 0.f;
	//int iPivot = 1;
	glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
	glPushMatrix();
	glRotatef(xRot, 1.0f, 0.0f, 0.0f);
	glRotatef(yRot, 0.0f, 1.0f, 0.0f);


	glBegin(GL_TRIANGLE_FAN);
	glVertex3f(0.0f, 0.0f, 75.0f);
	GLfloat color = 0.0f;

	for (int i = 0; i <= 32; i++)
	{
		x = 30.0f * sin(angle);
		y = 30.0f * cos(angle);

		glColor3f(0.2, color, color);
		glVertex2f(x, y);
		if (angle < GL_PI) color += 0.0625f;
		else color -= 0.0625f;

		angle += GL_PI / 16.0f;
	}

	glEnd();

	glBegin(GL_TRIANGLE_FAN);
	glVertex2f(0.0f, 0.0f);
	GLfloat colorOff = 0.0f;
	//glFrontFace(GL_CCW);
	angle = 0.0f;
	for (int i = 0; i <= 32; i++){
		
		x = 50.0f * sin(angle);
		y = 50.0f * cos(angle);
		glColor3f(0.3, colorOff, colorOff);
		glVertex2f(x, y);
		
		if (angle < GL_PI) colorOff += 0.0625f;
		else colorOff -= 0.0625f;

		angle += GL_PI / 16.0f;
	}
	glEnd();
	
	glPopMatrix();
	glutSwapBuffers();
}

void ChangeSize(GLsizei w, GLsizei h)
{
	GLfloat nRange = 100.0f;

	glViewport(0, 0, w, h);
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();

	if (w <= h){
		glOrtho(-nRange, nRange, -nRange * (h / w), nRange * (h / w), -nRange, nRange);
	}
	else{
		glOrtho(-nRange*(w / h), nRange*(w / h), -nRange, nRange, -nRange, nRange);
	}

	glMatrixMode(GL_MODELVIEW);
	glLoadIdentity();
}
void KeyControl(int key, int x, int y)
{
	if (key == GLUT_KEY_UP)
		xRot -= 5.0f;
	if (key == GLUT_KEY_DOWN)
		xRot += 5.0f;
	if (key == GLUT_KEY_LEFT)
		yRot -= 5.0f;
	if (key == GLUT_KEY_RIGHT)
		yRot += 5.0f;

	glutPostRedisplay();
}
void main(void)
{
	glutInitDisplayMode(GLUT_DOUBLE | GLUT_RGB | GLUT_DEPTH);
	glutInitWindowPosition(0, 0);
	glutInitWindowSize(512, 512);
	glutCreateWindow("CORN");
	glutSpecialFunc(KeyControl);
	glutDisplayFunc(RenderScene);
	glutReshapeFunc(ChangeSize);
	SetupRC();
	glutMainLoop();
}