package thread;

import java.io.IOException;

class MyThread extends Thread{
//class A implements Runnable	
//run needs override
	
	boolean flag = false;
	
	public MyThread(String name){
		this.setName(name);
	}
	String getThName(){
		return this.getName();
	}
	
	public void run(){
		
		while(!flag){
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
//		for(int i =0; i <= 20; i++){
//			System.out.print(i +"\t");
//		}
//		System.out.println("");
		
		}
		
		System.out.println( getThName() + " dead ");
	}
	
	void setFlag(boolean flag){
		this.flag = flag;
	}
}

public class MyThreadTest {

	public static void main(String[] args) throws IOException {
	
		/*
		System.out.println("main start");
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
//		MyThread runnable = new MyThread();
// 		Thread th1 = new Thread(runnable);
// 		Thread th2 = new Thread(runnable);
		
		th1.start();
		th2.start();
		System.out.println("main end");
		*/
		
		System.out.println("Main start");
		
		MyThread thA = new MyThread("A");
		MyThread thB = new MyThread("B");
		MyThread thC = new MyThread("C");
		
		thA.start();
		thB.start();
		thC.start();
		
		int i;
		
		while( (i = System.in.read()) != -1){
			char thName = (char)i;
			 if(thName == 'A'){
				 thA.setFlag(true);
			 }else if(thName == 'B'){
				 thB.setFlag(true);
			 }else if(thName == 'C'){
				 thC.setFlag(true);
			 }else if(thName == 'M'){
				 thA.setFlag(true);
				 thB.setFlag(true);
				 thC.setFlag(true);
				 break;
			 }
		}
		
		
		System.out.println(Thread.currentThread().getName() + " terminated");
	}

}
