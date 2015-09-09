package exception;

public class StudentNameFormatException extends IllegalArgumentException {
	
	public StudentNameFormatException(String message){
		super(message);
	}
}
