package javaHW4_student_information_system.student;

import javaHW4_student_information_system.subject.English;
import javaHW4_student_information_system.subject.Math;
import javaHW4_student_information_system.subject.Subject;

public class SubjectEnrollmentManager {
	
	private SubjectEnrollmentManager(){};
	
	static SubjectEnrollmentManager instance = new SubjectEnrollmentManager();
	
	public static SubjectEnrollmentManager getInstance() {
		
		if(instance == null)
			instance = new SubjectEnrollmentManager();
		
		return instance;
	}
	
	public Subject enrollSubject(String subject, int score){
		
		if(subject.toUpperCase().equals("MATH")) {
			return new Math(score);	
		} else if(subject.toUpperCase().equals("ENGLISH") ){
			return new English(score);	
		} else{
			System.out.println("NO such subject");
			return (Subject)null;
		}
		
	}
	
}
