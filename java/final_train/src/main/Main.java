package main;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;

import client.Client;
import fileIO.ClientInput;
import fileIO.ClientOutput;
import station.GatherArrivedClient;
import station.TicketingStation;
import station.TrainStation;

public class Main {
	
	public static TicketingStation ticS = new TicketingStation();
	public static TrainStation traS = new TrainStation();
	public static GatherArrivedClient gac = new GatherArrivedClient();
	public static long startTime = 0;
	
	public static void main(String[] args) {
		ArrayList<Client> clientlist = new ArrayList<Client>();
		int clientCount = 0;
		
		ClientInput CIn = new ClientInput();
		ClientOutput COut = new ClientOutput();
		
		COut.openOutStream();
		CIn.openInStream();
		
		try {
			
			startTime = System.currentTimeMillis();
			while((CIn.s = CIn.br.readLine())!=null){
				Client c = CIn.readInput();
				clientCount++;
				clientlist.add(c);
				c.run();
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		ticS.start();
		
		Timer trainTimer = new Timer();
		trainTimer.schedule(traS, 3000, 3000);
		
		Timer gatheringTimer = new Timer();
		gatheringTimer.schedule(gac, 3000, 1000);
		
		try { //Client output null Exception 방지를 위한 시간지
			Thread.sleep(300000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i=0; i<clientCount; i++){
			COut.writeOutput(clientlist.get(i));
		}	
		
		CIn.closeInStream();
		COut.closeOutStream();
		
	}



	
}
