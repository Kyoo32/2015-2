package lecture.abs;

public class SamsungTV extends TV {
	
	public SamsungTV(int channelLine){
		super(channelLine);
	}
	

	@Override
	public void channelUp() {
		System.out.println("samsung channelUp");
	}

	@Override
	public void channelDown() {
		System.out.println("samsung channelDown");
	}
	
	

}
