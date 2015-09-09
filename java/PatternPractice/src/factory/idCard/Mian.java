package factory.idCard;

import factory.Factory;
import factory.Product;

public class Mian {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.Create("Hong");
		Product card2 = factory.Create("Lee");
		Product card3 = factory.Create("Kim");
		card1.use();
		card2.use();
		card3.use();
	}

}
