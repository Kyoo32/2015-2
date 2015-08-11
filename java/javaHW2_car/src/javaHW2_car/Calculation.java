package javaHW2_car;

import java.util.ArrayList;

public class Calculation {
	
	public int calCompanyGoodsWorth(ArrayList<Car> carInStock){
		int count = carInStock.size();
		int sum = 0;
		
		for(int i=0; i<count; i++){
			sum += carInStock.get(i).getPrice() * carInStock.get(i).getInventory();
		}
		
		
		return sum;
	}
	
}
