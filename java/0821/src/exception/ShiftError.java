package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

public class ShiftError {

	public URL makeUrl(String Filename, String url) throws FileNotFoundException, MalformedURLException{
		FileInputStream fis= new FileInputStream("a.txt");
		
		return new URL(url);
	}
	
	public static void main(String[] args){
		ShiftError sh = new ShiftError();
		try {
			sh.makeUrl("a.txt", "httttttttp://www.naver.com");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e);
		} 
			
	
	}
}
