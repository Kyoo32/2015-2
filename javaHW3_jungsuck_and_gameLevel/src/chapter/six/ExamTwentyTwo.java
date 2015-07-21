package chapter.six;

public class ExamTwentyTwo {
	
	static boolean isNumber(String str){
		boolean result = true;
		int len = str.length();
		
		if(str == null || len == 0){
			result = false;
			return result;
		}
		
		for(int i=0; i<len; i++){
			char c = str.charAt(i);
			if(!Character.isDigit(c))
				result = false;
		}
		
		return result;
	}

	public static void main(String[] args) {

		String str = "123";
		System.out.println(str + "is a number? " + isNumber(str));
		
		str = "1234a";
		System.out.println(str + "is a number? " + isNumber(str));
	}

}
