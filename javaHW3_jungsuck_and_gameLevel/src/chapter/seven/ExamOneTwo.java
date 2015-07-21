package chapter.seven;

public class ExamOneTwo {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i=0; i<deck.cards.length; i++)
			System.out.print(deck.cards[i].toString() + ",");
		
		
		System.out.println();
		System.out.println(deck.pick(0).toString());
		System.out.println(deck.pick().toString());
		deck.shuffle();
		
		for(int i=0; i<deck.cards.length; i++)
			System.out.print(deck.cards[i].toString() + ",");
		
		System.out.println();
		System.out.println(deck.pick(0).toString());
	}
	
}
