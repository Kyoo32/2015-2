package first;

public class Man {

	public String name;
	private int height;
	private float weight;
	public String character;
	
	public Man(){}
	public Man(String name){
		this.name = name;
	}
	
	/*
	 public void setName(String name_input ){
		name = name_input;
	}
	*/
	
	
	public void setName(String name){
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getName(){
		return name;
	}
	
}
