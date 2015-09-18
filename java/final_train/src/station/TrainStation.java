package station;

import java.util.Date;
import java.util.TimerTask;

import client.Client;

public class TrainStation extends TimerTask implements Station {
	ClientQueue cq;
	
	public TrainStation(){
		cq = new ClientQueue();
	}
	
	
	void enqueue(Client c){
		System.out.println("la");
		cq.enqueue(c);
		c.trainWaitingTimeSpent();	
		System.out.println("lala");
	}
	
		
	@Override
	public void calTimeInterval(Object ob) {
		if(ob instanceof Client){
			((Client) ob).trainWaitInterval = (int) (((Client)ob).dequeueTime - ((Client)ob).enqueueTime);
		}
	}

	@Override
	public void setDate(Object ob) {
		if(ob instanceof Client){
			((Client) ob).arrivalStation = new Date();
		}
	}

	@Override
	public void run() {
		System.out.println("train departs");
		trainDepart();
	}


	private synchronized void trainDepart() {
		int many = cq.size();
		System.out.println(cq.size());
		for(int i=0; i<many; i++){
			Client goC = cq.dequeue();
			System.out.println(goC);
			calTimeInterval(goC);
			goC.interrupt();
		}
		
		//notifyAll();	
	}

}
