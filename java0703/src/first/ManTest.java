package first;

public class ManTest {

	public static void main(String[] args) {
		Man lee = new Man();
		//lee.height = 180;
		lee.setHeight(180);
		lee.setName("Tyler");
		
		Man kim = new Man("Lloyd");
		
		
		System.out.println(lee.getName());
		System.out.println(kim.getName());
		Pointer p = new Pointer();
		System.out.println(p);
		
		System.out.println();
		
	}
	

}
