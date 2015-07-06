package javaHW1_date;



public class Input {
	
	static int integer;
	
	public static void main(String[] args){
		Input user = new Input();
		Scanner newInput = new Scanner(System.in);
		user.integer = newInput.nextInt();
		user.integer.getInput();
	}
	
	public int getInput(){
		return integer;
	}
}
