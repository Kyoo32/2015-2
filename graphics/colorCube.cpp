#include <GL/glut.h>
#include <Windows.h>
#include <math.h>
#include <stdio.h>

GLfloat vertices[][3] = {
	{ -15.0f, -15.0f, 15.0f },
	{-15.0f, 15.0f, 15.0f },
	{ 15.0f, 15.0f, 15.0f },
	{ 15.0f, -15.0f, 15.0f },
	{ -15.0f, -15.0f, -15.0f },
	{ -15.0f, 15.0f, -15.0f },
	{ 15.0f, 15.0f, -15.0f },
	{15.0f, -15.0f, -15.0f }
};
GLfloat colors[][3] = {
	{ 1.0, 0.0, 0.0 },
	{ 1.0, 1.0, 0.0 },
	{ 0.0, 1.0, 0.0 },
	{ 0.0, 0.0, 1.0 },
	{ 1.0, 1.0, 1.0 },
	{1.0, 0.0, 1.0}	
};

void SetupRC(void)
{
	glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
	glShadeModel(GL_SMOOTH);
	//glColor3f(1.0f, 1.0f, 0.0f);
	//glFrontFace(GL_CW);
	//glEnable(GL_CULL_FACE);
	glEnable(GL_DEPTH_TEST);
}
void polygon(int a, int b, int c, int d)
{
	glBegin(GL_POLYGON);
	glColor3fv(colors[a]);
	glVertex3fv(vertices[a]);
	glColor3fv(colors[b]);
	glVertex3fv(vertices[b]);
	glColor3fv(colors[c]);
	glVertex3fv(vertices[c]);
	glColor3fv(colors[d]);
	glVertex3fv(vertices[d]);
	glEnd();
}
void creatCube(void){
	polygon(0, 3, 2, 1);
	polygon(2, 3, 7, 6);
	polygon(3, 0, 4, 7);
	polygon(4, 5, 6, 7);
	polygon(1, 2, 6, 5);
	polygon(5, 4, 0, 1);
}
void RenderScene(void)
{
	GLfloat x, y, theta;

	theta = 1.0;
	x = (2.0) * cos(theta);
	y = (2.0) * sin(theta);

	glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
	glMatrixMode(GL_MODELVIEW);
	glLoadIdentity();
	gluLookAt(x, y, 2.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0);
	creatCube();

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

void main(void)
{
	glutInitDisplayMode(GLUT_DOUBLE | GLUT_RGB | GLUT_DEPTH);
	glutInitWindowPosition(0, 0);
	glutInitWindowSize(512, 512);
	glutCreateWindow("Cube");

	glutDisplayFunc(RenderScene);
	glutReshapeFunc(ChangeSize);
	SetupRC();

	glutMainLoop();
}