package chapter.six;

public class MyTv {
	
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOnOff(){
		if(this.isPowerOn)
			this.isPowerOn = false;
		else
			this.isPowerOn = true;
	}
	
	void volumeUp(){
		if(this.volume< MAX_VOLUME)
			this.volume ++;
	}
	
	void volumeDown(){
		if(this.volume > MIN_VOLUME)
			this.volume --;
	}
	
	void channelUp(){
		this.channel ++;
		if(this.channel == MAX_CHANNEL)
			this.channel = MIN_CHANNEL;
	}
	
	void channelDown(){
		this.channel --;
		if(this.channel == MIN_CHANNEL)
			this.channel = MAX_CHANNEL;
	}
}
