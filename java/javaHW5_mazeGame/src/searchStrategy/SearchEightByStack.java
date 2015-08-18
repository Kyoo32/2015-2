package searchStrategy;

import java.util.Iterator;

public class SearchEightByStack implements SearchExitInterface {
	
	
	Stack stack = Stack.getInstance();
	int[][] direction = { {0, -1}, {1, -1}, {1, 0}, {1, 1}, {0 ,1}, {-1, 1}, {-1, 0}, {-1, -1} }; 
	
	
	@Override
	public void searchExit(int[][] tdw) {
	
		Integer[] present = new Integer[2];
		present[0] = Integer.valueOf(0);
		present[1] = Integer.valueOf(0);
		
		int directionIdx = 0;
		int[][] visited = { {0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0}
						};
		boolean canGo = false;
		
		while( !(present[0]==7 && present[1]==7) ) {
			
			if(directionIdx == 8 && canGo == false){
				
				/*
				 * present = stack.pop();
				 
			
				System.out.println("pop");
				System.out.printf("db: %3d, %3d \n", present[0].intValue(), present[1].intValue());
			*/ 
				this.printExit();
				break;
			}	
			
			visited[present[0]][present[1]] = 1;
			canGo = false;
			
			for(directionIdx = 0; directionIdx < direction.length; directionIdx++){
				int nextX = present[0] + direction[directionIdx][0];
				int nextY = present[1] + direction[directionIdx][1];
				
				if(nextX<0 ||nextY<0 ||nextX>7 || nextY>7) continue;
				
				if(tdw[nextX][nextY] == 0 && visited[nextX][nextY] !=1) {
					canGo = true;
					//System.out.println("PUSH : " + present[0] + present[1]);
					//stack.push(present);
					
					present[0] =nextX; 
					present[1] =nextY;		
					break;
				}		
			}
		
			
		}
		
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
			if(i != (tempPoint.length -1) ) System.out.print(" -> "); 
		}
		
		System.out.println("");	
	}


}
