





public class Student {
	
	public String name;
	public String major;
	public String address;
	
	private static int serialNumber = 1001;
	private int studentNumber;
	
	public Student(){
		
		this("no name","no major", "no address");
	}
	
	public Student(String name, String major, String address){
		this.name = name;
		this.major = major;
		this.address = address;
		
		initStudentNumber();		
	}
	
	public void initStudentNumber()
	{
		this.studentNumber = serialNumber++;
	}
	
	public String getName() {
		return name;
	}	
	public String getAddress() {
		return address;
	}

	protected String getMajor() {
		return major;
	}

	protected static int getSerialNumber() {
		return serialNumber;
	}

	protected static void setSerialNumber(int serialNumber) {
		Student.serialNumber = serialNumber;
	}
	
	
	
	
	
}
