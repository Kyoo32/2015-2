package arraylist_company;

import java.util.ArrayList;

public class Company2 {
	
	private static Company2 instance = new Company2();
	public ArrayList<Employee> employeeList = new ArrayList<Employee>();
	
	public Company2(){}
	
	
	/*
	static{
		//처음에 로딩되어야 할 코드, 한번만 로딩되어야 할 코드 / define 클래스는 주로 상
		int max = 100;
		ArrayList aList = new ArrayList();
	}
	*/
	
	public static Company2 getCompany(){
		return instance;
	}

	public void addEmployee(Employee e) {
		this.employeeList.add(e);
		// TODO Auto-generated method stub
		
	}


	public char[] employeeList(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}
