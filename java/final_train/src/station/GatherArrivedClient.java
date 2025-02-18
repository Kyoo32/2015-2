package station;

import java.util.TimerTask;
import client.Client;
import client.ClientQueue;

public class GatherArrivedClient extends TimerTask {
	//고객 도착, 도착 정보 관리 
	ClientQueue goingCq = new ClientQueue();
	
	@Override
	public void run() {
		gatherArrivedClient();
	}

	public void gatherArrivedClient() {
		int many = goingCq.size();
		if(many == 0) return;
		for(int i=0; i < many; i++){
			Client client = goingCq.index(i);
			if((System.currentTimeMillis() - client.dequeueTime) >= (long) client.travelTime) {
				goingCq.dequeue().trainArrived();
				many--;
				i--;
			}
		}
	}

}
