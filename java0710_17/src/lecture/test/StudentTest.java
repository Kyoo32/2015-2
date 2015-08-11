package lecture.test;

import junit.framework.TestCase;
import lecture.template.Student;

public class StudentTest extends TestCase{

	//test code starts with low capital 'test'
	public void testStudent(){
		Student student = new Student("James");
		assertEquals("James", student.getName());
	
	}	
}
