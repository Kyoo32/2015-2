package chapter.six;

import java.util.Arrays;

public class ExamTwenty {

	public static int[] shuffle(int[] arr){
		int len = arr.length;
		int temp = 0;
		
		for(int i=0;i<len;i++){
			int changeTo = (int) (Math.random() * (len-1));
			temp = arr[i];
			arr[i] = arr[changeTo];
			arr[changeTo] = temp;
		}
		
		
		return arr;
	}
	
	public static void main(String[] args){
		int[] original = {1, 2, 3, 4 ,5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(Arrays.toString(result));
	}
}
