package stream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInOutTest {

	public static void main(String[] args) {

		System.out.println("입력 후 마지막에 '끝'을 입력하세요.");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		//OutputStreamWriter
		
		try {
			int i;
			while( (i = isr.read()) != '끝'){
				System.out.print((char)i);
			}
			System.out.println("");
		} catch(IOException e){
			e.printStackTrace();
		}
			
	}

}
