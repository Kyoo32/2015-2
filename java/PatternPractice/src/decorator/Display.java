package decorator;

public abstract class Display {
	public abstract int getColumns();
	public abstract int getrows();
	public abstract String getRowText(int row);
	public final void show(){
		for(int i = 0; i < getrows(); i++){
			System.out.println(getRowText(i));
		}
	}
}
