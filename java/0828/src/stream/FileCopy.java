package stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;

public class FileCopy {
	
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream(args[0]);
		FileOutputStream fos = new FileOutputStream(args[1]);
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		
	//	BufferedReader
	//	BufferedWriter
		Socket socket = new Socket();
		//decorater pattern
		//BufferedReader br = new BufferedReader(socket.getOutputStream());
		
		
		int i;
		int len = 0;
		long pseconds = System.currentTimeMillis();
		
		while( (i=bis.read()) != -1){
			bos.write(i);
			len++;
		}
		
		pseconds = System.currentTimeMillis() - pseconds;
		System.out.println("len = " + len + "bytes," + pseconds + "seconds" );
		
		bis.close();
		bos.close();
		
		
	}

}
