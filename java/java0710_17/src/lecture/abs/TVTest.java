package lecture.abs;

public class TVTest {
	public static void main(String[] args){
		TV tv = new LgTV(10);
		TV tv2 = new SamsungTV(5);
		
		tv.channelUp();
		tv2.channelUp();
		
		tv.turnOff();
		tv2.turnOn();
	}
}
