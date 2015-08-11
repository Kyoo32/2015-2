package arraylist;

public class AccountArrayListTest {

	public static void main(String[] args) {
		AccountManagerArrayList manager = new AccountManagerArrayList();
		
		manager.insertAccount("1231", "Tomas", 1000.0f);
		manager.insertAccount("1232", "James", 2300.0f);
		manager.insertAccount("1233", "John",  4000.0f);
		manager.insertAccount("1234", "Edward", 5000.0f);
		
		manager.setDeposite("1232", 700f);
		manager.setDeposite("1231", 1000f);
		
		manager.displayAll();
	}

}
