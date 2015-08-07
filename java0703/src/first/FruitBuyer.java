package first;

public class FruitBuyer {
	private int money;
	private int fruitCount;
	
	

	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	 
	public int getFruitCount() {
		return fruitCount;
	}
	public void setFruitCount(int fruitCount) {
		this.fruitCount = fruitCount;
	}
	public void buyFruit(FruitSeller seller, int howMuch){
		int fruitCount = seller.Fruit.price / howMuch; 
		
		
	}
	

}
