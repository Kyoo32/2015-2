package station;

import java.util.ArrayList;
import java.util.Date;
import client.Client;

public class TicketingStation extends Station{
	public ArrayList<TicketBox> tbs = new ArrayList<TicketBox>();
	
	public TicketingStation(){
		tbs.add(new TicketBox());
		tbs.add(new TicketBox());
		tbs.add(new TicketBox());
	}
	
	public synchronized TicketBox match() throws InterruptedException{
		
		Thread t = Thread.currentThread();
		while(tbs.size() == 0){ //v.s. if
			System.out.println("["+t.getName()+"]" + " is waiting.");
			super.cq.enqueue((Client) t);
		}
		
		TicketBox tb = tbs.remove(0);
		System.out.println("["+t.getName()+"]" + " uses "+ tb);
		return tb;
	}
	
	public synchronized void ticketFinish(Client c){
		System.out.println("["+c.getName()+"]" + " returns "+ c.tb);
		setDate(c);
		tbs.add(c.tb);
		this.notifyAll();// need to fit strategy
	}

	@Override
	void calTimeInterval(Object ob) {
		if(ob instanceof Client){
			((Client) ob).ticketWaitInterval = (int) (((Client)ob).dequeueTime - ((Client)ob).enqueueTime);
		}
	}

	@Override
	void setDate(Object ob) {
		if(ob instanceof Client){
			((Client) ob).ticketFinish = new Date();
		}
	}
	
}
