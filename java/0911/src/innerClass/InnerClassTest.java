package innerClass;

class Outer
{
	private int outer1 = 100;
	Inner inner;
	class Inner
	{
		String str = "hello";
		public void test(){
			System.out.println(str);
			System.out.println(outer1);
		}
	}
	
	
	public Outer(){
		inner = new Inner();
	}
	
	public void outTest(){
		inner.test();
	}
	
	public Runnable getRunnable(){
		int i =0; //automatically becomes final
		return new Runnable(){

			@Override
			public void run() {
				System.out.println(i);
				System.out.println("runnable");
				
			}
			
		};
		
		/*
		class Command implements Runnable{
			@Override
			public void run() {
				System.out.println(i);
				System.out.println("runnable");
				
				//i = 100;
			}	
		}
		return new Command();
	}
	*/
	}

}
public class InnerClassTest {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.outTest();
		
		Outer.Inner in = outer.new Inner();
		in.test();
		
		Runnable rn = outer.getRunnable();
		rn.run();
	
	}
}
