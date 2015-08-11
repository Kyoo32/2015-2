package arraylist_company;

public class Main {

	public static void main(String[] args){
		
		Company2 c = new Company2();
		
		c.addEmployee(new Secretary("James", "Linda"));
		c.addEmployee(new Manager("Edward", "Finance"));
		c.addEmployee(new Manager("Lee", "Personal"));
		
		Information info = new Information();
		info.getinfo();
		
		
	}
}
