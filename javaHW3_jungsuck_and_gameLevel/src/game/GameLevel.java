package game;

public abstract class GameLevel {
	public abstract void simpleAttack();
	public abstract void turnAttack();
	public abstract void flyingAttack();
	
	public abstract void startBar();
	public abstract void endBar();
	
	public final void play(){
		startBar();
		
		simpleAttack();
		turnAttack();
		flyingAttack();
		
		endBar();
	}

}
