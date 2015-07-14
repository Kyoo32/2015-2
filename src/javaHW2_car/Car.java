package javaHW2_car;

public class Car {
	private String name;
	private int price;
	private int inventory;
	
	
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getPrice() {
		return price;
	}
	protected void setPrice(int price) {
		this.price = price;
	}
	protected int getInventory() {
		return inventory;
	}
	protected void setInventory(int inventory) {
		this.inventory = inventory;
	}
	
	public void addInventory(int plus){
		this.setInventory(this.getInventory()+plus);
	}
	
	public void minusInventory(int minus){
		this.setInventory(this.getInventory()-minus);
	}
		
	
	public void Say(){
		System.out.println("This is a car.");
	}
	
}

