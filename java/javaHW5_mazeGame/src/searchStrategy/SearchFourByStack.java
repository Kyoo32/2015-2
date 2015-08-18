package searchStrategy;

import java.util.Iterator;


public class SearchFourByStack implements SearchExitInterface{
	
	Stack stack = Stack.getInstance();
	
	@Override
	public void searchExit(int[][] tdw) {
	
		
		
		
		
			
		
	}

	@Override
	public void printExit() {
		Iterator<int[]> itr = stack.iterator();
		int i=0;
				
		while(itr.hasNext()){
			int[] tempPoint = itr.next();
			
			System.out.print("(");
			for(i=0; i<tempPoint.length; i++){
				System.out.printf("%2d",tempPoint[i]);
				if(i != (tempPoint.length-1) ) System.out.print(" , "); 
			}
			System.out.print(")");
			if(i != (tempPoint.length-1) ) System.out.print(" -> "); 
		}
		
		
	}


}
