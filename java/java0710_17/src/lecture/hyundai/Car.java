package lecture.hyundai;

public abstract class Car {
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	
	public final void carUse(){
		start();
		drive();
		stop();
	}
	
}
