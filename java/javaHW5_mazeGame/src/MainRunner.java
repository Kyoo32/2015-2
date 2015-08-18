import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javaHW5_mazeGame.maze.EightMaze;
import javaHW5_mazeGame.maze.FourMaze;
import javaHW5_mazeGame.maze.Maze;
import searchStrategy.SearchEightByStack;
import searchStrategy.SearchFourByStack;
import searchStrategy.SearchStrategy;

public class MainRunner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		FileInputStream fis = new FileInputStream("db.properties");
		Properties prop = new Properties();
		prop.load(fis);;
		String searchType  = prop.getProperty("SEARCH");
		
		SearchStrategy search = new SearchEightByStack();
		Maze maze = new EightMaze();
		
		System.out.println(searchType);
		if(searchType.equals("4")){
			search = new SearchFourByStack();
			maze = new FourMaze();
		}
		
		maze.printMaze();
		maze.search(search);
	
	}

}
