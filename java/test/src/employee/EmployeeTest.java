package employee;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee employeeLee = new Employee("재성");
		System.out.println(employeeLee.getEmployeeID());
	
		Employee employeeKim = new Employee("기범");
		System.out.println(employeeKim.getEmployeeID());
	}
}


