package singleton;

public class Main {

	public static void main(String[] args) {
		System.out.println("Start. ");
		Singleton ob1 = Singleton.getInstance();
		Singleton ob2 = Singleton.getInstance();
		if(ob1 == ob2){
			System.out.println("ob1 is same as ob2");
		} else {
			System.out.println("ob1 is different to ob2");
		}
		System.out.println("End.");
	}

}
