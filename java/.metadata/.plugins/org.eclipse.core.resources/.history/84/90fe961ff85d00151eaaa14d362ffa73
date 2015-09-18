package main;
import java.util.Timer;

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
		
		CIn.openInStream(COut);
		COut.openOutStream();
		CIn.readInput();

		CIn.closeInStream();
		COut.closeOutStream();
	}
}
