package videoshop;

public class VideoShopTest {

	public static void main(String[] args) {

		IQueue vShop = new VideoShop();
		
		vShop.enQueue("matrix1");
		vShop.enQueue("Matrix2");
		vShop.enQueue("Matrix3");
		
		System.out.println(vShop.deQueue());
		System.out.println(vShop.deQueue());
		System.out.println(vShop.deQueue());
	}

}
