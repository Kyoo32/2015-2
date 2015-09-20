package station;

import java.util.ArrayList;
import java.util.Date;

import client.Client;
import client.ClientQueue;
import main.Main;

public class TicketingStation extends Thread implements Station{
	//고객 받기, 고객과 매표소 연결, 고객 티켓팅 정보 관
	ClientQueue cq;
	public ArrayList<TicketBox> tbs = new ArrayList<TicketBox>();
	
	public TicketingStation(){
		cq = new ClientQueue();
		tbs.add(new TicketBox());
		tbs.add(new TicketBox());
		tbs.add(new TicketBox());
		System.out.println(cq);
	}
	
	public void arrive(Client client) {
		cq.enqueue(client);
	}
	
	public void run(){
		System.out.println("hello");
		match();	
	}
	
	public void match() {
		if(cq.size() == 0) return; 
		if(tbs.size() == 0){ 
			System.out.println("no ticketbox available");	
		} else{
			for(int i =0 ; i<cq.size() ; i++){
				if(System.currentTimeMillis() - Main.startTime >= cq.index(0).visitTimeSpent){
					Client matchedClient = cq.dequeue();
					i--;
					calTimeInterval(matchedClient);	
					matchedClient.tb = tbs.remove(0);
					System.out.println("[" + matchedClient+ "]" + " uses "+ matchedClient.tb);
					matchedClient.tb.ticketing(matchedClient);
				}
			}
		}
	}
		
	public void ticketFinish(Client c){
		System.out.println("["+c+"]" + " returns "+ c.tb);
		setDate(c);
		tbs.add(c.tb);
	}

	@Override
	public void calTimeInterval(Object ob) {
		if(ob instanceof Client){
			((Client) ob).ticketWaitInterval = (int) (((Client)ob).dequeueTime - ((Client)ob).enqueueTime);
		}
	}

	@Override
	public void setDate(Object ob) {
		if(ob instanceof Client){
			((Client) ob).ticketFinish = new Date();
		}
	}

}
