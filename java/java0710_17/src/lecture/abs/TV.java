package lecture.abs;

public abstract class TV {
	int channelLine;
	
	public TV(int channelLine){
		this.channelLine = channelLine;
	}
	
	public void turnOn(){
		System.out.println("turn on()");
	}
	
	public void turnOff(){
		System.out.println("turn off()");
	}
	
	
	public abstract void channelUp();
	public abstract void channelDown();
	

}

