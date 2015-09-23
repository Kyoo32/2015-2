package employee;

public class GiveID {
	static int now = 20150;
	
	public static GiveID instance = new GiveID(){};
	private GiveID(){
		
	}
	
	public static GiveID getInstance(){
		return instance;
	}

	public int getId() {
		now++;
		return now;
	}
}	
