package car;

import java.util.HashMap;


public class CarFactory {
	public static CarFactory instance = new CarFactory();
	HashMap<String , Car> hm = new HashMap<String, Car>();
	private CarFactory(){
		
	}
	
	public Car createCar(String string) {
		if(hm.containsKey(string)) return hm.get(string);
		
		Car newCar = new Car(string);
		hm.put(string, newCar);
		return newCar;
		
	}

	public static CarFactory getInstance() {
		return instance;
	}

}
