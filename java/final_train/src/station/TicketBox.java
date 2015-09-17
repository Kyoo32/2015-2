package station;

import client.Client;

public class TicketBox {
	TrainStation ts;
	public void ticketing(Client c){
		ts.cq.enqueue(c);
	}
}
