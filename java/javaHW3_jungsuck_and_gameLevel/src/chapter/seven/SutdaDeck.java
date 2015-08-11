package chapter.seven;

public class SutdaDeck {

	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	int num;

	SutdaDeck(){
		for(int i=0; i<CARD_NUM; i++){
			num = i%10 +1;
			if(i< 10 && (num==1 || num==3 || num==8))
				cards[i] = new SutdaCard(num, true);
			else
			cards[i] = new SutdaCard(num, false);
		}	
	}
	
	void shuffle(){
		SutdaCard temp = new SutdaCard();
		
		for(int i=0; i<CARD_NUM; i++){
			int changeTo = (int) (Math.random() *(CARD_NUM-1));
			temp = this.cards[i];
			this.cards[i] = this.cards[changeTo];
			this.cards[changeTo] = temp;
		}
	}
	
	SutdaCard pick(int index){
		return this.cards[index];
	}
	
	SutdaCard pick(){
		int index = (int)(Math.random() *(CARD_NUM-1));
		return this.cards[index];
	}
}
	
	
