package arraylist_company;

public class Information {
	
	Company2 c = new Company2();
	
	public Information(){
		
	}
	public void getinfo() {
		// TODO Auto-generated method stub
		for(int i=0; i<c.employeeList.size(); i++){
			String aout = c.employeeList.get(i).showInfo();
			System.out.println(aout);
		}
	}
	

}
