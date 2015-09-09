package coffee;

public class coffeeTest {

	public static void main(String[] args) {

		Coffee espresso  = new Espresso(); // Espresso Coffee
		espresso.brewing();
		System.out.println("");
		Coffee americano = new Americano(new Espresso());
		americano.brewing();
		System.out.println("");
		Coffee latte = new LatteCoffee(new Americano(new Espresso()));
		latte.brewing();
		System.out.println("");
		
	}

}
