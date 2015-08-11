package javaHW4_student_information_system.student;

import java.util.ArrayList;

import javaHW4_student_information_system.subject.Subject;

public class Student {
	public String name;
	String studentID;
	public String major;	
	SubjectEnrollmentManager SEM = SubjectEnrollmentManager.getInstance();
	private ArrayList<Subject> enrolledSubject = new ArrayList<Subject>();
		
	public Student(String name, String studentID, String major) {
		this.name = name;
		this.studentID = studentID;
		this.major = major;
	}
	
	public void enrollSubject(String subject, int score){	
		getEnrolledSubject().add(SEM.enrollSubject(subject, score));	
	}

	public ArrayList<Subject> getEnrolledSubject() {
		return enrolledSubject;
	}
}
