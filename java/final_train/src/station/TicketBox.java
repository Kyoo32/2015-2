package station;

import client.Client;
import main.Main;

public class TicketBox extends Thread {
	//티켓 매표소 : 티켓
	public void ticketing(Client c){
		c.matchedTime = System.currentTimeMillis();
		c.ticketingTimeSpent();
		Main.ticS.ticketFinish(c);
		Main.traS.enqueue(c);
		return;
	}

}
