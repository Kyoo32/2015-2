package object;

public class Dog {
	String name;
	String type;
	
	public Dog(String name, String type){
		this.name = name;
		this.type= type;
	}

	@Override
	public String toString() {
		
		return name;
	}
	
	
}
