package treeset;

import java.util.TreeSet;

public class AccountTreeSetTest {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(100);
		set.add(10);
		set.add(50);
		
		System.out.println(set);
		//insert되어 compare될 때
		
		AccountManagerTreeSet manager = new AccountManagerTreeSet();
		
		manager.insertAccount("1231", "Tomas", 1000.0f);
		manager.insertAccount("1232", "James", 2300.0f);
		manager.insertAccount("1233", "John",  4000.0f);
		manager.insertAccount("1234", "Edward", 5000.0f);
		manager.insertAccount("12345", "Ellizabeth", 7000.0f);
		
		manager.setDeposite("1232", 700f);
		manager.setDeposite("1231", 1000f);
		
		manager.displayAll();
		
		
	}

}
