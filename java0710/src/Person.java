
public class Person {
	private String name;
	private float weight;
	private float height;
	
	public Person(String name){
	/*	this.name = name;
		this.weight = 3.4f;
		this.height = 53.0f;
	*/
		
		//weight = 3.4f는 에러! before constructing , to insert value anywhere 
		this(name, 3.4f, 53.0f);
	}
	
	public Person(String name, float weight, float height){
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	
	public void printThis(){
		System.out.println(this);
	}
	
	public Person getThis(){
		return this;
	}
	
}
