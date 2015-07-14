package javaHW2_car;

import java.util.ArrayList;

public class CarCompany {
	
	protected ArrayList<Car> carInStock = new ArrayList<Car>();
	
	private static CarCompany hyundai = new CarCompany();
	
	public CarCompany(){};
	
	
	
	public void setArrayListItem(Car newCar){
		this.carInStock.add(newCar);
	}
	
	public static CarCompany getInstance(){
			
			if(hyundai == null)
				hyundai = new CarCompany();
			
			return hyundai;
	}
}
