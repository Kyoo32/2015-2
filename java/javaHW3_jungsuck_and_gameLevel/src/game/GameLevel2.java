package game;

public class GameLevel2 extends GameLevel{
	private static GameLevel2 instance = new GameLevel2();
	
	private GameLevel2(){}
	
	public static GameLevel2 getInstance(){
		
		if(instance == null)
			instance = new GameLevel2();
		
		return instance;
	}
	
	@Override
	public void simpleAttack() {
		System.out.println("level2 simple attack: 얍!");
	}

	@Override
	public void turnAttack() {
		System.out.println("level2 turn attack: 휙!");
	}

	@Override
	public void flyingAttack() {
		System.out.println("level2 flying attack: σ(oдolll)");
	}

	@Override
	public void startBar() {
		System.out.println("==========level2 start==========");
	}

	@Override
	public void endBar() {
		System.out.println("==========level2 end============");		
	}

}
