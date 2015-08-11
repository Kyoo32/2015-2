
public class Manager extends Employee {
	public String department;
	public int i = 20;

	public Manager(String name){
		super(name);
		//System.out.println("Manager()");
		
	}
	
	
	public String getDetail(){
		return super.getDetail() + department ; 
	}
}
