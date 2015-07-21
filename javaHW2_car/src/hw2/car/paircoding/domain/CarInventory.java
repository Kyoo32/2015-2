package hw2.car.paircoding.domain;

import java.util.ArrayList;

import hw2.car.paircoding.car.Car;
import hw2.car.paircoding.car.Genesis;
import hw2.car.paircoding.car.Granger;
import hw2.car.paircoding.car.Sonata;

public class CarInventory {
	
		private ArrayList<Car> carList = new ArrayList<Car>();

		private Integer sonataStock = 0;
		private Integer grangerStock = 0;
		private Integer genesisStock = 0;

		public CarInventory() {
			addSonata(3);
			addGranger(2);
			addGenesis(1);
		}

		private void addGenesis(int amount) {
			for (int j = 0; j < amount; j++) {
					carList.add(new Sonata());
					genesisStock++;
			}
		}

		private void addGranger(int amount) {
			for (int j = 0; j < amount; j++) {
					carList.add(new Granger());
					grangerStock++;
			}
		}

		private void addSonata(int amount) {
			for (int j = 0; j < amount; j++) {
					carList.add(new Genesis());
					sonataStock++;
			}
		}

		public Integer getSonataStock() {
			return sonataStock;
		}

		public Integer getGenesisStock() {
			return genesisStock;
		}

		public Integer getGrangerStock() {
			return grangerStock;
		}
}
