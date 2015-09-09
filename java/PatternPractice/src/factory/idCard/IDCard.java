package factory.idCard;

import java.util.Random;

import factory.Product;

public class IDCard extends Product {
	private String owner;
	private int certiNumber;
	IDCard(String owner){
		System.out.println(owner + "'s card are made.");
		this.setOwner(owner);
		this.setCertiNumber();
		System.out.println("The certification number is "+ certiNumber);
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
	public int getCertiNumber() {
		return certiNumber;
	}
	public void setCertiNumber() {
		this.certiNumber = new Random().nextInt();
	}

}
