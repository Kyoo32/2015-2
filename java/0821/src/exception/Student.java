package exception;

import java.util.logging.Logger;

import logging.MyLogger;

public class Student {
	
	public String studentName;
	MyLogger myLogger = MyLogger.getInstance();
	
	public Student(String studentName){
		if(studentName == null)
			throw new StudentNameFormatException("name must not be null.");
		if(studentName.split(" ").length > 3 )
			throw new StudentNameFormatException("your name is too long.");
		this.studentName = studentName;
	}

	public String getStudentName() {
		myLogger.fine("begin getStudentName()");
		return studentName;
	}
}