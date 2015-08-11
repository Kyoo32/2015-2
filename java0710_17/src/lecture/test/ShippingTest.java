package lecture.test;

import junit.framework.TestCase;
import lecture.shipping.Company;
import lecture.shipping.GenerateReport;
import lecture.shipping.RiverBarge;
import lecture.shipping.Truck;

public class ShippingTest extends TestCase{
	
	public void testShipping(){
		Company company = Company.getCompany();
		company.addVehicle(new Truck(500, 50));
		company.addVehicle(new Truck(100, 20));
		company.addVehicle(new RiverBarge(300, 10));
		company.addVehicle(new RiverBarge(300, 10));
		company.addVehicle(new Truck(250, 50));
		
		GenerateReport report = new GenerateReport();
		assertEquals(80.0, report.generateFuelNeeds());
		
	
		
	}
}
