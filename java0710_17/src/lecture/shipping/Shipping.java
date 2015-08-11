package lecture.shipping;

public abstract class Shipping {
	
	double tripDistance;
	double fuelEfficiency;
	
	public abstract double calcTripDistance();
	public abstract double calcFuelDistance();
	
	public final double calcFuelNeeds(){
		return calcTripDistance()/calcFuelDistance();
	}
	
}
