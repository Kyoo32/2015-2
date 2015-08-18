package searchStrategy;

import java.util.Iterator;


public class SearchFourByStack implements SearchExitInterface{
	
	Stack stack = Stack.getInstance();
	int[][] direction = { {0, -1},  {1, 0},  {0 ,1},  {-1, 0} }; 

	@Override
	public void searchExit(int[][] tdw) {
	
		Integer[] present = new Integer[2];
		present[0] = Integer.valueOf(0);
		present[1] = Integer.valueOf(0);
		
		int directionIdx = 0;
		int[][] visited = { {0,0,0,0},
							{0,0,0,0},
							{0,0,0,0},
							{0,0,0,0},
						};
		boolean canGo = false;
		
		while( !(present[0]==3 && present[1]==3) ) {
			
			if(directionIdx == 4 && canGo == false){
				present = stack.pop();
			}	
			
			visited[present[0]][present[1]] = 1;
			canGo = false;
			
			for(directionIdx = 0; directionIdx < direction.length; directionIdx++){
				int nextX = present[0] + direction[directionIdx][0];
				int nextY = present[1] + direction[directionIdx][1];
				
				if(nextX<0 ||nextY<0 ||nextX>3 || nextY>3) continue;
				
				if(tdw[nextX][nextY] == 0 && visited[nextX][nextY] !=1) {
					canGo = true;
					Integer[] tobePushed = new Integer[2];
					tobePushed[0] = present[0];
					tobePushed[1] = present[1];
					stack.push(tobePushed);
					
					present[0] =nextX; 
					present[1] =nextY;		
					break;
				}		
			}	
		}
		stack.push(present);
			
		
	}

	@Override
	public void printExit() {
	
		System.out.println("To go out, follow the below way: ");
		
		Iterator<Integer[]> itr = stack.iterator();
		int i=0;
				
		while(itr.hasNext()){
			Integer[] tempPoint = itr.next();
			
			System.out.print("(");
			for(i=0; i<tempPoint.length; i++){
				System.out.printf("%2d",tempPoint[i]);
				if(i != (tempPoint.length-1) ) System.out.print(" , "); 
			}
			System.out.print(")");
			if(itr.hasNext()) System.out.print(" -> "); 
		}	
		System.out.println("");	
	}
}
