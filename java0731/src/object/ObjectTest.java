package object;



public class ObjectTest {
	
	public static void main(String[] args){
		Dog myDog = new Dog("bow", "hybrid");
		System.out.println(myDog);
	
		String str = new String("aaa");
		System.out.println(str.toString());
		
		Integer i = new Integer(100);
		System.out.println(i);
	}
}
