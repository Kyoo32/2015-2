package hash;

import java.util.HashSet;

public class AccountHashTest {

	public static void main(String[] args) {
		AccountManagerHash manager = new AccountManagerHash();
		
		manager.insertAccount("1231", "Tomas", 1000.0f);
		manager.insertAccount("1232", "James", 2300.0f);
		manager.insertAccount("1233", "John",  4000.0f);
		manager.insertAccount("1234", "Edward", 5000.0f);
		manager.insertAccount("1234", "Edward2", 5000.0f);
		
		manager.setDeposite("1232", 700f);
		manager.setDeposite("1231", 1000f);
		manager.setDeposite("1234", 1000f);
		
		manager.displayAll();
		
		HashSet<String> set = new HashSet<String>();
		set.add("CounHyang");
		set.add("Cindelera");
		set.add("SimChung");
		set.add("CounHyang");
		
		System.out.println(set);
	
	
	
	}

}
