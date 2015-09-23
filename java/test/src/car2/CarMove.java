package car2;

abstract class CarMove {
	
	abstract void start();
	abstract void drive();
	abstract void stop();
	abstract void turnoff();
	
	abstract void washCar();
	
	final void run(){
		start();
		drive();
		stop();
		turnoff();
		
		washCar();
	}
	
}
