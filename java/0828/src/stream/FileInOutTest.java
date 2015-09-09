package stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileInOutTest {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = null;
		FileWriter fw = null;
		
		OutputStreamWriter ow = null;
		
		try{
				fos = new FileOutputStream("out.txt", true);
				ow = new OutputStreamWriter(fos);
				fos.write(101);
				fos.write(102);
				ow.write("ㅋㅋㅋ");
				
				fw = new FileWriter("out1.txt", true);
				fw.write("안녕,세계");
		} catch(IOException e){
			e.printStackTrace();
		} finally {
			try{
			//	fos.close();
				fw.close();
				ow.close();
			} catch(IOException e){
				e.printStackTrace();
			}
		}
		
		
		
		FileInputStream fis = null;
		FileReader fr = null;
		int i;
		
		try {
			
			fis = new FileInputStream("out.txt");
		
			while( (i =fis.read()) != -1 ){
				System.out.println(i);
			}
			
			fr = new FileReader("out1.txt");
			
			while( (i =fr.read()) != -1 ){
				System.out.print((char)i);
			}
			
		} catch(IOException e){
			e.printStackTrace();
		} finally {
			
			try {
				fis.close();
				fr.close();
			} catch(IOException e){
				e.printStackTrace();
			}
			
		}
	}

}
