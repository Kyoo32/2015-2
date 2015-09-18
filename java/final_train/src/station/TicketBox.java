package station;

import client.Client;
import main.Main;

public class TicketBox {
	
	public void ticketing(Client c){
		c.ticketingTimeSpent();
		System.out.println("Ticket open@@@@@@");
		Main.traS.enqueue(c);
	}

}
