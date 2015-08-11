package javaHW4_student_information_system.school;

import java.util.ArrayList;

import javaHW4_student_information_system.strategy.Strategy;
import javaHW4_student_information_system.strategy.englishMajorScore.EnglishMajorScore;
import javaHW4_student_information_system.strategy.mathMajorScore.MathMajorScore;
import javaHW4_student_information_system.student.Student;

public class ReportStudentDegree {

	private ReportStudentDegree(){};
	
	static ReportStudentDegree rsd = new ReportStudentDegree();

	public static ReportStudentDegree getRsd(){
		if(rsd == null){
			return new ReportStudentDegree();
		}
		return rsd;
	}

	public void reportStudentDegree(ArrayList<Student> stulist){
		for (int i = 0; i < stulist.size(); i++) {
			Student student = stulist.get(i);
			Strategy strategy = new MathMajorScore();
			
			if (student.major.toUpperCase().equals("MATH")){
				strategy.outputDegree(student);
			}else if (student.major.toUpperCase().equals("ENGLISH")){
				strategy = new EnglishMajorScore();
				strategy.outputDegree(student);
			}
		}
	}
	
	
}
