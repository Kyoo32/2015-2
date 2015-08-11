package game;

public class GameLevel1 extends GameLevel{
	
	private static GameLevel1 instance = new GameLevel1();
	
	private GameLevel1(){}
	
	public static GameLevel1 getInstance(){
		
		if(instance == null)
			instance = new GameLevel1();
		
		return instance;
	}
	
	@Override
	public void simpleAttack() {
		System.out.println("level1 simple attack: 얍!");
	}

	@Override
	public void turnAttack() {
		System.out.println("level1 turn attack: (T-T)");
	}

	@Override
	public void flyingAttack() {
		System.out.println("level1 flying attack: σ(oдolll)");
	}

	@Override
	public void startBar() {
		System.out.println("==========level1 start==========");
	}

	@Override
	public void endBar() {
		System.out.println("==========level1 end============");		
	}

}
