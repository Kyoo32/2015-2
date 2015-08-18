package searchStrategy;

import java.util.ArrayList;
import java.util.Iterator;

//singleton
public class Stack {
	
	int topIdx = -1;
	ArrayList<Integer[]> stack = new ArrayList<Integer[]> ();
	
	private static Stack instance = new Stack();
	
	private Stack(){}
	
	public static Stack getInstance(){
		
		if(instance == null)
			instance = new Stack();
		
		return instance;
	}
	
	public void push(Integer[] point){
		topIdx ++;
		stack.add(point);
		//System.out.println("PUSH : " + point);
	}
	
	public Integer[] pop(){
		Integer[] result = stack.remove(topIdx);
		//System.out.println("POP : " + result);
		topIdx--;
		return result;
		
	}

	public Iterator<Integer[]> iterator() {
		// TODO Auto-generated method stub
		return stack.iterator();
	}


}
