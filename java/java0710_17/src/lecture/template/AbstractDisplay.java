package lecture.template;

public abstract class AbstractDisplay {
	public abstract void begin();
	public abstract void display();
	public abstract void end();
	
	public void line(){} //hook method: not required but can do alpha

	//write scenario/template method
	public final void show(){
		begin();
		for(int i=0; i<5;i++){
			display();
		}
		end();
		line();
		
	};
}
