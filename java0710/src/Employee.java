
public class Employee {
	public String name;
	public int sabun;
	protected double salary;
	public int i = 10;
	
	public Employee(String name){
		this.name = name;
	//	System.out.println("Employ()");
	}
	
	public double getSalary(){
		return salary;
	}
	
	public void setSalary(double salary){
		this.salary =salary;
	}
	
	public String getDetail(){
		return name + "," + salary+ "," + sabun; 
	}
}
