package javaHW5_mazeGame.maze;


import searchStrategy.SearchExitInterface;

public abstract class Maze{
	
	int[][] maze; 
	
	public abstract void printMaze();
	public abstract void search(SearchExitInterface st);
}
