package employee;

public class Employee {
	
	private int employeeID;
	public String employeeName;

	GiveID giveId = GiveID.getInstance();
	public Employee(String string) {
		employeeName = string;
		employeeID = giveId.getId();
	}


	public int getEmployeeID() {
		return employeeID;
	}

}
