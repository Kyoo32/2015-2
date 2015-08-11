package lecture.shipping;

import java.util.ArrayList;

public class GenerateReport {
	
	Company compa = Company.getCompany();

	public double generateFuelNeeds() {
		ArrayList<Vehicle> vList = compa.getList();
		double total = 0.0;
		
		for (int i=0; i< vList.size();i++){
			total += vList.get(i).calcFuelNeeds();
		}
		
		return total;
	}

}
