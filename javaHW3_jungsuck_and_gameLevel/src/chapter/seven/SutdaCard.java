package chapter.seven;

public class SutdaCard {
	final int num;
	final boolean isKwang;
	
	SutdaCard(){
		this(1, true);
	}

	public SutdaCard(int i, boolean b) {
		this.num = i;
		this.isKwang = b;
	}
	
	public String toString(){
		return num + (isKwang ? "k": "" );
	}
}
