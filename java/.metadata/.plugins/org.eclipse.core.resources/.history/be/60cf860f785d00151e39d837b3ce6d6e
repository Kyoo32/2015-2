package station;

import java.util.Date;

import client.Client;

public class TrainStation extends Station{

	@Override
	void calTimeInterval(Object ob) {
		if(ob instanceof Client){
			((Client) ob).trainWaitInterval = (int) (((Client)ob).dequeueTime - ((Client)ob).enqueueTime);
		}
	}

	@Override
	void setDate(Object ob) {
		if(ob instanceof Client){
			((Client) ob).arrivalStation = new Date();
		}
	}

}
