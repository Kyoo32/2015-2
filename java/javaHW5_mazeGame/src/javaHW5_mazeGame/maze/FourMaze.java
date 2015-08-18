package javaHW5_mazeGame.maze;

import searchStrategy.SearchExitInterface;

public  class FourMaze  extends Maze{
	
	int[][] maze = { 
			{0, 1, 0, 1} ,
			{0, 0, 0, 0} ,
			{1, 0, 1, 0},
			{1, 1 ,0, 0}
	}; //0 is path, 1 is wall.
	
	@Override
	public void printMaze() {
		
		System.out.println("   0  1  2  3");
		System.out.println(" ┏━━━━━━━━┓");
		for(int i=0; i<maze.length;i++){
			System.out.printf("%1d", i);
			System.out.print("┃");
			for(int j=0; j<maze[i].length; j++){
				if(maze[i][j] == 0) System.out.print(" □ ");
				else System.out.print(" ■ ");
			}
			System.out.print("┃\n");
		}
		System.out.println(" ┖━━━━━━━━┚");	
	}

	
	
	
	
	@Override
	public void search(SearchExitInterface st) {
	
		st.searchExit(maze);
		
		
	}


	

}
