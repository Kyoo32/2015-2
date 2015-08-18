package javaHW5_mazeGame.maze;

import searchStrategy.SearchExitInterface;

public class EightMaze extends Maze{
	
	int [][] maze = {
			{0, 1, 1, 1, 0, 1, 1, 1},
			{0, 0, 0, 1, 0, 0, 0, 0},
			{1, 1, 0, 0, 0, 1, 0, 1},
			{1, 1, 0, 1, 1, 1, 0, 1},
			{1, 0, 0, 1, 0, 0, 0, 0},
			{0, 1, 1, 1, 0, 1, 1, 1},
			{1, 0, 1, 1, 0, 0, 0, 0},
			{0, 1, 1, 0, 1, 1, 1, 0}
	};
	
	@Override
	public void printMaze() {
		
		System.out.println("◁▲▽▶Welcome to Maze(8X8)◀▽▲▷\n");
		System.out.println("   0  1  2  3  4  5  6  7 ");
		System.out.println(" ┏━━━━━━━━━━━━━━━━┓");
		for(int i=0; i<maze.length; i++){
			System.out.printf("%1d", i);
			System.out.print("┃");
			for(int j=0; j<maze[i].length; j++){
				if(maze[i][j] == 0) System.out.print(" □ ");
				else System.out.print(" ■ ");
			}
			System.out.print("┃\n");
		}
		System.out.println(" ┖━━━━━━━━━━━━━━━━┚\n");
	}

	@Override
	public void search(SearchExitInterface st) {
	
		st.searchExit(maze);
		st.printExit();
		
	}

	
}
