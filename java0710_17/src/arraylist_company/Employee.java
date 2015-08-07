package arraylist_company;

public class Employee {

	public String name;
	private double salary;
	private int idNum;
	
	public Employee(String name){
		this.name = name;
	}

	protected double getSalary() {
		return salary;
	}

	protected void setSalary(double salary) {
		this.salary = salary;
	}

	protected int getIdNum() {
		return idNum;
	}

	protected void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	
	public String showInfo(){
		return this.name + this.getSalary() + this.getIdNum();
	}
	
}
