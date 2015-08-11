package chapter.six;

public class ExamSix {
	static double getDistance(int x, int y, int x1, int y1){
		double result = 0;
		double gapOfX = (float)x - (float)x1;
		double gapOfY = (float)y - (float)y1;
		result = Math.sqrt(gapOfX*gapOfX+ gapOfY *gapOfY);
		return result;
	}
	
	public static void main(String[] args){
		System.out.println(getDistance(1,1,2,2));
	}
}
