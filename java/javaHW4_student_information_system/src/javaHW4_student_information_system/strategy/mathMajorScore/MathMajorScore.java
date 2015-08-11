package javaHW4_student_information_system.strategy.mathMajorScore;

import javaHW4_student_information_system.strategy.Strategy;
import javaHW4_student_information_system.student.Student;
import javaHW4_student_information_system.subject.English;
import javaHW4_student_information_system.subject.Math;
import javaHW4_student_information_system.subject.Subject;

public class MathMajorScore implements Strategy{

	@Override
	public void outputDegree(Student stu) {
		for (int i=0; i< stu.getEnrolledSubject().size() ; i++){
			int score = stu.getEnrolledSubject().get(i).score;
			Subject subject= stu.getEnrolledSubject().get(i);
			
			System.out.print(stu.name + "'s ");
			if(subject instanceof Math){
				System.out.print( "math degree is ");
				majorSubjectDegree(score);
			}else if(subject instanceof English){
				System.out.print("english degree is ");
				nonMajorSubjectDegree(score);
			}else System.out.println("default");
		}
		
	}
	@Override
	public void majorSubjectDegree(int score) {
		if(score>100 || score<0) System.out.println("Wrong scope.");
		else if(score>=95) System.out.println("A");
		else if(score>=90) System.out.println("B");
		else if(score>=80) System.out.println("C");
		else if(score>=60) System.out.println("D");
		else System.out.println("F");
		
	}

	@Override
	public void nonMajorSubjectDegree(int score) {
		if(score>100 || score<0) System.out.println("Wrong scope.");
		else if(score>=90) System.out.println("A");
		else if(score>=80) System.out.println("B");
		else if(score>=70) System.out.println("C");
		else if(score>=55) System.out.println("D");
		else System.out.println("F");
		
	} 

}
