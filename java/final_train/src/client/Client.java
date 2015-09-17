package client;

import java.util.Date;

import station.TicketBox;
import main.Main;

public class Client extends Thread {
	int id;
	String name;
	
	int visitTime;
	int ticketingInterval;
	String departSName;
	String destSName;
	public int ticketWaitInterval;
	public int trainWaitInterval;
	
	transient public long enqueueTime;
	transient public long dequeueTime;
	//?train running time spend?
	public Date ticketFinish;
	public Date arrivalStation;
	transient public TicketBox tb;
	
	Client(int id, String name, int visitTime, int ticketingInterval, String departSName, String destSName){
		this.id = id;
		this.name = name;
		this.visitTime = visitTime;
		this.ticketingInterval = ticketingInterval;
		this.departSName = departSName;
		this.destSName = destSName;
	}
	
	public void run(){
		try {
			tb = Main.ticS.match();
			tb.ticketing(this);
			if(tb == null){
				System.out.println("[" + this.getName() +"] go back home" );
				return;
			}
			Main.ticS.ticketFinish(this);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
