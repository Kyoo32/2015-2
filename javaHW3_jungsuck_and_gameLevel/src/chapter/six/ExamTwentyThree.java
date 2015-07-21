package chapter.six;

import java.util.Arrays;

public class ExamTwentyThree {

	public static void main(String[] args) {
		int[] data = {3, 2, 9,4, 7};
		System.out.println(Arrays.toString(data));
		System.out.println("Max value: " + max(data));
		System.out.println("Max value: " + max(null));
		System.out.println("Max value: " + max(new int[]{}));
			
		
	}

	private static int max(int[] data) {
		if(data == null)
			return -999999;
		
		int max = 0;
		int len = data.length;
		
		if(len == 0)
			return -999999;
		
		for(int i=0; i<len;i++){
			max = (max < data[i])? data[i] : max;
		}
			
		return max;
	}

}
