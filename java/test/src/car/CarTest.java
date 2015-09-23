package car;

public class CarTest {
	
	public static void main(String[] args){
				CarFactory factory = CarFactory.getInstance();
				
				Car sonata1 = factory.createCar("명찬차");
				Car sonata2 = factory.createCar("명찬차");
		
				System.out.println(sonata1 == sonata2);
				
				Car avante1 = factory.createCar("태우차");
				Car avante2 = factory.createCar("태우차");
				System.out.println(avante1 == avante2);
				
				System.out.println(sonata1 == avante1);	
		}

}
