package hw2.car.paircoding.domain;

import hw2.car.paircoding.car.Genesis;
import hw2.car.paircoding.car.Granger;
import hw2.car.paircoding.car.Sonata;

public class Accountant {

	public Integer getTotalCarWorth(CarInventory inventory) {
		Integer sum = 0;

		sum += inventory.getGenesisStock() * new Genesis().getPrice();
		sum += inventory.getSonataStock()* new Sonata().getPrice();
		sum += inventory.getGrangerStock() * new Granger().getPrice();
		
		return sum;
	}
}
