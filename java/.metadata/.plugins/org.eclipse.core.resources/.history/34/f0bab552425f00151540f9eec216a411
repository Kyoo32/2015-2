package main;
import java.io.IOException;
import java.util.Timer;

import client.Client;
import fileIO.ClientInput;
import fileIO.ClientOutput;
import station.TicketingStation;
import station.TrainStation;

public class Main {
	public static TicketingStation ticS = new TicketingStation();
	public static TrainStation traS = new TrainStation();
	
	
	public static void main(String[] args) {
		ClientInput CIn = new ClientInput();
		ClientOutput COut = new ClientOutput();
		
		Timer trainTimer = new Timer();
		trainTimer.schedule(traS, 3000, 3000);
		
		COut.openOutStream();
		CIn.openInStream();
		try {
			while((CIn.s = CIn.br.readLine())!=null){
				Client c = CIn.readInput();
				c.start();
				try {
					c.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				COut.writeOutput(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		CIn.closeInStream();
		COut.closeOutStream();
	}
}
