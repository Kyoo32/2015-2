package chapter.six;

public class SutdaCard {
	int num;
	boolean isKwang;
	
	public SutdaCard(int num, boolean b){
		this.num = num;
		this.isKwang = b;
	}
	
	public SutdaCard(){
		this.num = 1;
		this.isKwang = true;
	}
	
	public String info(){
		String result ="";
		result += String.valueOf(num);
		if(this.isKwang)
			result += "K";
		return  result;
	}
}	
