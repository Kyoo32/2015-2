package factory.idCard;


import java.util.ArrayList;

import factory.Factory;
import factory.Product;

public class IDCardFactory extends Factory{
	private ArrayList<Object> owners = new ArrayList<Object>();
	
	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		owners.add( ((IDCard) product).getOwner());
	}

}
