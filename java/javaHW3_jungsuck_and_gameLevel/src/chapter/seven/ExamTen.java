package chapter.seven;

public class ExamTen {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH: " + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL: " + t.getVolume());
	}

}
