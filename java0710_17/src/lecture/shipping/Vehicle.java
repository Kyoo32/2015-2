package lecture.shipping;

public class Vehicle  {
	
	double tripDistance;
	double fuelEfficiency;
	
	public Vehicle(double tripDistance, double fuelEfficiency){
		this.tripDistance= tripDistance;
		this.fuelEfficiency = fuelEfficiency;
	}
	
	/*
	public double calcTripDistance(){
		TripDistance = 
		
	};
	public double calcFuelDistance(){};
	*/
	
	public final double calcFuelNeeds(){
		return this.tripDistance/this.fuelEfficiency;
	}
}
