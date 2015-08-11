package object;

class Student{
	String studentId;
	String studentName;
	
	public Student(String studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student){
			Student stu = (Student)obj;
			
			if(this.studentId == stu.studentId)
				return true;
			else 
				return false;
		}
		else 
			return false;
			
	}

	@Override
	public int hashCode() {
		return studentId.hashCode();
	}
	
	public int myHashCode(){
		return super.hashCode();
	}
	
	
}

public class EqualsTest {

	public static void main(String[] args) {
		Student studentKim1 = new Student("1234", "kibeom");
		Student studentKim2 = new Student("1234", "kibeom");
		
		
		System.out.println(studentKim1 == studentKim2);
		System.out.println(studentKim1.equals(studentKim2));
		
		System.out.println(studentKim1.hashCode());
		System.out.println(studentKim2.hashCode());
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
	}

}
