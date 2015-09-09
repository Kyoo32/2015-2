package factory.idCard;

import factory.Product;

public class IDCard extends Product {
	private String owner;
	IDCard(String owner){
		System.out.println(owner + "'s card are made.");
		this.setOwner(owner);
	}
	@Override
	public void use() {
		System.out.println(owner + " uses the card.");
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

}
