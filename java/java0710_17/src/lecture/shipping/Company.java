package lecture.shipping;

import java.util.ArrayList;

public class Company {
	public ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
	
	private static Company com = new Company();
	
	
	public Company(){}

	public static Company getCompany() {
		return com;
	}

	public void addVehicle(Vehicle thing) {
		vehicleList.add(thing);		
	}

	public ArrayList<Vehicle> getList() {
		return vehicleList;
	}

	

}
