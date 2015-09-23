package car;

public class CarFactory {
	public static CarFactory instance = new CarFactory();
	
	private CarFactory(){
		
	}
	

	public Car createCar(String string) {
		return new Car(string);
	}

	public static CarFactory getInstance() {
		return instance;
	}

}
