package chapter.six;

public class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1){
		double result = 0;
		double gapOfX = (float)this.x - (float)x1;
		double gapOfY = (float)this.y - (float)y1;
		result = Math.sqrt(gapOfX*gapOfX+ gapOfY *gapOfY);
		return result;
	}
}
