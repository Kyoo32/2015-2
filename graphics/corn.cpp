#include <GL/glut.h>
#include <math.h>

#define GL_PI 3.1415f
static GLfloat xRot = 0.0f;
static GLfloat yRot = 0.0f;

void SetupRC(void)
{
	glClearColor(0.0f, 0.0f, 0.0f, 1.0f);

	glColor3f(0.0f, 1.0f, 0.0f);
}

void RenderScene(void)
{
	GLfloat x, y, z, angle;
	glClear(GL_COLOR_BUFFER_BIT);
	glPushMatrix();
	glRotatef(xRot, 1.0f, 0.0f, 0.0f);
	glRotatef(yRot, 0.0f, 1.0f, 0.0f);
	glBegin(GL_POINTS);
	z = -50.0f;

	GLfloat rad = 1.0f;

	for (angle = 0.0f; angle <= 2.0f * GL_PI * 3.0f ; angle += 0.1f){
		x = 60.0f * rad * sin(angle);
		y = 60.0f * rad * cos(angle);
		glVertex3d(x, y, z);
		z += 0.5f;
		rad -= 0.003f; // 0.01·Î ¼³Á¤ÇÏ¸é ±úÁü... ¾Æ¸¶µµ Äà½ÎÀÎ?
	  
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
		glOrtho(-nRange, nRange, -nRange * (h/w) , nRange * (h/w), -nRange, nRange);
	}
	else{	
		glOrtho(-nRange*(w/h), nRange*(w/h), -nRange, nRange, -nRange, nRange);
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
	glutCreateWindow("Spring");
	glutSpecialFunc(KeyControl);
	glutDisplayFunc(RenderScene);
	glutReshapeFunc(ChangeSize);	
	SetupRC();
	glutMainLoop();
}