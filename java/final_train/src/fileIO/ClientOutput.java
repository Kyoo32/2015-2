package fileIO;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import client.Client;

public class ClientOutput {
	FileWriter fw = null;
	BufferedWriter bw = null;
	String buffer;
	public void openOutStream(){
		try {
			fw = new FileWriter("clientArrived.txt", false);
			bw = new BufferedWriter(fw);
			bw.write("ID | NAME | VISIT STATION | WAITING TICKET | TICKETING |"
					+ " TICKET FINISH | WAITING TRAIN | ARRIVAL");
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void writeOutput(Client c){
		buffer =  Integer.toString(c.id) + " | " + c.name + " | " + Integer.toString(c.visitTimeSpent) + " | " 
				+ Integer.toString(c.ticketWaitInterval) + " | " +Integer.toString(c.ticketingInterval) + " | " 
				+ c.ticketFinish.toString() + " | " + Integer.toString(c.trainWaitInterval) + " | "
				+ c.arrivalStation.toString(); 
				
		try {
			bw.write(buffer);
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void closeOutStream(){
		if(bw != null) try{bw.close();}catch(IOException e){}
		if(fw != null) try{fw.close();}catch(IOException e){}	
	}
	
}
