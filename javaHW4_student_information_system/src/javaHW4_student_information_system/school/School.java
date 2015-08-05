package javaHW4_student_information_system.school;

import java.util.ArrayList;

import javaHW4_student_information_system.student.Student;

public class School {
	String name;
	ArrayList<Student> stuList = new ArrayList<Student>();
	ReportStudentDegree rsd = ReportStudentDegree.getRsd();
	
	private School(String name){
		this.name = name;
	};
	
	static School instance = new School("CoolGuySchool");


	public static School getInstance() {
		
		if(instance == null)
			instance = new School("CoolGuySchool");
		
		return instance;
	}
	
	public void registerStudent(Student stu){
		stuList.add(stu);
	}
	
	public void reportStudentDegree(){
		rsd.reportStudentDegree(stuList);
	}
	
}

