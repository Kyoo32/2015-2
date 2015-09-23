package stream;

class Textview {
	String text = "Hello World";
	
	public void viewing(){
		System.out.println(text);
	}
}
class Scroll extends Textview{
	Textview tv;
	String text = "Scrolling ";
	
	Scroll(Textview tv){
		this.tv = tv;
	}
	
	public void viewing(){
		System.out.print(text);
		tv.viewing();
	}
}
class Line extends Textview{
	Textview tv;
	String text = "Line ";
	
	Line(Textview tv){
		this.tv = tv;
	}
	
	public void viewing(){
		System.out.print(text);
		tv.viewing();
	}
}
class Spring extends Textview{
	Textview tv;
	String text = "Spring ";
	
	Spring(Textview tv){
		this.tv = tv;
	}
	
	public void viewing(){
		System.out.print(text);
		tv.viewing();
	}
}

class Bordering extends Textview{
	Textview tv;
	String text = "Bordering ";
	
	Bordering(Textview tv){
		this.tv = tv;
	}
	
	public void viewing(){
		System.out.print(text);
		tv.viewing();
	}
}


public class Main {

	public static void main(String[] args) {
		Textview tx = new Textview();
		Textview st = new Scroll(tx);
		Textview sl = new Spring(new Line(tx));
		Textview lsb = new Line(new Scroll(new Bordering(tx)));
		tx.viewing();
		st.viewing();
		sl.viewing();
		lsb.viewing();
	}

}
