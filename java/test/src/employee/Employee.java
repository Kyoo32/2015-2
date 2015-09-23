package employee;

public class Employee {
	
	GiveID giveId = GiveID.getInstance();
	private int employeeID;
	public String employeeName;

	public Employee(String string) {
		employeeName = string;
		employeeID = giveId.getId();
	}


	public int getEmployeeID() {
		return employeeID;
	}

}
