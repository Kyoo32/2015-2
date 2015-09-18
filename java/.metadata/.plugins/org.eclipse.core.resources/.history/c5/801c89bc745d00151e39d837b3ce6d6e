package station;

import java.util.ArrayList;

import client.Client;

public class ClientQueue {
	protected ArrayList<Client> clientQ = new ArrayList<Client>();
	
	void enqueue(Client c){
		clientQ.add(c);
		c.enqueueTime = System.currentTimeMillis(); 
	}
	
	Client dequeue(){
		if(!clientQ.isEmpty()){
			Client finishC = clientQ.remove(0);
			finishC.dequeueTime = System.currentTimeMillis();
			return finishC;
		} else {
			return null;
		}
	}
}
