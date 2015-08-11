package javaHW4_student_information_system.strategy;

import javaHW4_student_information_system.student.Student;

public interface Strategy {
	public abstract void outputDegree(Student stu);
	public abstract void majorSubjectDegree(int score);
	public abstract void nonMajorSubjectDegree(int score);
	
}
