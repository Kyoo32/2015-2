package arraylist_company;

public class Secretary extends Employee {
	public String boss;

	public Secretary(String string, String string2) {
		// TODO Auto-generated constructor stub
		super(string);
		this.boss =string2;
		
	}
	

	public String showInfo(){
		return super.showInfo() + boss;
	}

}
