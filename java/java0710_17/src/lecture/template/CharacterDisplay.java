package lecture.template;

public class CharacterDisplay extends AbstractDisplay {
	
	char ch;
	
	public CharacterDisplay(char ch){
		this.ch = ch;
	}

	@Override
	public void begin() {
		// TODO Auto-generated method stub
		System.out.print("<<");
		
	}

	@Override
	public void display() {
		System.out.print(ch);
		
	}

	@Override
	public void end() {
		System.out.print(">>");
	}
	
	
	public void line(){
		System.out.println();
		System.out.println("=======");
	}
	
	
}
