package thread;

public class PriorityTest extends Thread{
	
	int sum;
	public void run(){
		
		System.out.println(getName() + "," + this.getPriority() + ": start");
		for(int i=0; i<1000; i++){
			sum += i;
			
			try {
				sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(getName() + "," + this.getPriority() + ": end");
	}
	
	
	public static void main(String[] args) {
		
		for(int i = Thread.MIN_PRIORITY; i<= Thread.MAX_PRIORITY; i++){
			PriorityTest pt = new PriorityTest();
			pt.setPriority(i);
			pt.start();
		}
	}

}
