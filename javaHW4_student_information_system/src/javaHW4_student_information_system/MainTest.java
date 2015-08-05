package javaHW4_student_information_system;

import javaHW4_student_information_system.school.School;
import javaHW4_student_information_system.student.Student;

public class MainTest {

	public static void main(String[] args) {
		School school = School.getInstance();
		
		Student lee1 = new Student("이승기", "141213", "math");
		school.registerStudent(lee1);
		lee1.enrollSubject("math", 95);
		lee1.enrollSubject("english", 20);
		
		Student kim1 = new Student("김수현", "141518", "english");
		school.registerStudent(kim1);
		kim1.enrollSubject("math", 90);
		kim1.enrollSubject("english", 100);
		
		Student ju = new Student("주원", "141230", "math");
		school.registerStudent(ju);
		ju.enrollSubject("math", 76);
		ju.enrollSubject("english", 60);
		
		Student kim2 = new Student("김우빈", "141255", "math");
		school.registerStudent(kim2);
		kim2.enrollSubject("math", 85);
		kim2.enrollSubject("english", 89);
		
		Student lee2 = new Student("이민호", "141590", "english");
		school.registerStudent(lee2);
		lee2.enrollSubject("math", 90);
		lee2.enrollSubject("english", 95);
		
		school.reportStudentDegree();
	}

}
