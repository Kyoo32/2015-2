package lecture.abs;

public class LgTV extends TV {
	
	public LgTV(int channelLine){
		super(channelLine);
	}

	@Override
	public void channelUp() {
		System.out.println("Lg channelUp");
	}

	@Override
	public void channelDown() {
		System.out.println("Lg channelUp");
	}

}
