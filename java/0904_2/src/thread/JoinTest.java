package thread;

public class JoinTest extends Thread {

	int first;
	int last;
	int sum = 0;
	
	public JoinTest(int first, int last){
		this.first = first;
		this.last = last;
	}
	
	public void run(){
		for(int i = first; i <= last ; i++)
			sum += i;
		System.out.println("sum: " + sum);
	}
		
	public static void main(String[] args)  {
		System.out.println("main start");
		JoinTest th1 = new JoinTest(1, 50);
		JoinTest th2 = new JoinTest(51, 100);
		
		th1.start();
		th2.start();
		
		Thread thread = Thread.currentThread();
		try {
			th1.join();
			
			thread.interrupt();
			
			th2.join();
		} catch (InterruptedException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
		
		int Total = th1.sum + th2.sum;
		System.out.println(th1.sum);
		System.out.println(th2.sum);
		System.out.println("All is "+ Total);
		System.out.println("main end");
	}
		
}
