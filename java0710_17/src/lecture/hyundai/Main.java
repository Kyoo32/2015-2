package lecture.hyundai;

public class Main {

	public static void main(String[] args) {
		
		Sonata sonata = new Sonata();
		sonata.sonataStart();
		sonata.sonataDrive();
		sonata.sonataBreak();
		sonata.sonataClean();
		
		Genesis genesis = new Genesis();
		genesis.genesisStart();
		genesis.genesisDrive();
		genesis.genesisBreak();
		genesis.genesisClean();
	}

}
