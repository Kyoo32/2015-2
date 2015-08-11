package chapter.seven;

public class MyTv2 {
	
	private boolean isPowerOn;
	private int channel;
	private int volume;
	int prevChannel = 0;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	protected boolean isPowerOn() {
		return isPowerOn;
	}
	protected void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	protected int getChannel() {
		return channel;
	}
	protected void setChannel(int channel) {
		this.prevChannel = this.channel;
		this.channel = channel;
	}
	protected int getVolume() {
		return volume;
	}
	protected void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	protected void gotoPrevChannel(){
		this.setChannel(this.prevChannel);
	}
	

}
