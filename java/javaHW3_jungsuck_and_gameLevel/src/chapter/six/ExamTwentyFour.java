package chapter.six;

public class ExamTwentyFour {

	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + "의 절대값:" + abs(value));
		
		value = -10;
		System.out.println(value + "의 절대값:" + abs(value));
	}

	private static int abs(int value) {
		
		if(value < 0)
			value = value * (-1);
		
		return value;
	}

}
