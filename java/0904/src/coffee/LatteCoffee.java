package coffee;

public class LatteCoffee extends Decorator {

	public LatteCoffee(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}
	
	public void brewing(){
		super.brewing();
		System.out.println("adding milk ");
	}
	

}
