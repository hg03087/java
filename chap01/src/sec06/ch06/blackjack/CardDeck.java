package sec06.ch06.blackjack;

public class CardDeck {
	private final Card[] CARD_ARR = new Card[52];  //카드객체를 담을 수 있는 은닉화된 전역배열상수 존재
	private final int AGE = 10;

	String[] pt_arr = {"스페이드", "하트", "다이아","클로버"};
	String[] sb_arr = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	
	public CardDeck() {
		int k = 0;
		for(int i = 0; i<pt_arr.length; i++) {
			for(int z=0; z<sb_arr.length; z++) {
				CARD_ARR[k] = new Card(pt_arr[i], sb_arr[z]);
				System.out.printf("%s\n", CARD_ARR[k]);
				k++;
			}
		}
	}//기본 생성자
}

