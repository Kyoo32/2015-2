package main;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import client.Client;
import station.TicketingStation;
import station.TrainStation;

public class Main {
	public static TicketingStation ticS = new TicketingStation();
	public TrainStation traS = new TrainStation();
	
	
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		try{		
			// "ReadFile.txt" 파일을 읽는 FileReader 객체 생성
			// BufferedReader 객체 생성		
			fr = new FileReader("client.txt");
			br = new BufferedReader(fr);
			
			String s = null;
			String[] sArr;
			
			// ReadFile.txt 에서 한줄씩 읽어서 BufferedRaeder에 저장한다.
			while((s=br.readLine())!=null){		
				sArr = new String(s).split(" ");
			}	
		} catch(Exception e){	
			e.printStackTrace();	
		} finally{
			
			// BufferedReader FileReader를 닫아준다.
			if(br != null) try{br.close();}catch(IOException e){}
			if(fr != null) try{fr.close();}catch(IOException e){}	
		}	
	}
}
