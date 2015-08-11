package game;

import java.util.ArrayList;

public class Player {
	GameLevel level ;
	static int levelIndex = 0;
	ArrayList<GameLevel> levelList = new ArrayList<GameLevel>();
	
		
	Player(){
		levelList.add(GameLevel1.getInstance());
		levelList.add(GameLevel2.getInstance());
		levelList.add(GameLevel3.getInstance());
		
		this.level = levelList.get(0);
	}
	
	public void upgradeLevel() {
		levelIndex ++;
		this.level =levelList.get(levelIndex);
	}
	
	public void attack() {
		this.level.play();
	}

	
}
