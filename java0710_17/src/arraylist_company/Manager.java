package arraylist_company;

public class Manager extends Employee {
	
	private String department;
	
	public Manager(String name, String department){
		super(name);
		this.department = department;	
	}
	
	public String showInfo(){
		return super.showInfo() + department;
	}
}

