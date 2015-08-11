package game;

public class GameLevel3 extends GameLevel{
	private static GameLevel3 instance = new GameLevel3();
	
	private GameLevel3(){}
	
	public static GameLevel3 getInstance(){
		
		if(instance == null)
			instance = new GameLevel3();
		
		return instance;
	}
	
	@Override
	public void simpleAttack() {
		System.out.println("level3 simple attack: 얍!");
	}

	@Override
	public void turnAttack() {
		System.out.println("level3 turn attack: 휙!");
	}

	@Override
	public void flyingAttack() {
		System.out.println("level3 flying attack: 휙! 촵!");
	}

	@Override
	public void startBar() {
		System.out.println("==========level3 start==========");
	}

	@Override
	public void endBar() {
		System.out.println("==========level3 end============");		
	}

}
