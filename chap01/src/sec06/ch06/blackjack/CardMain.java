package sec06.ch06.blackjack;

public class CardMain {
	public static void main(String[] args) {
		Card c1 = new Card("스페이드", "K");
		System.out.println(c1); //스페이드(k)
	
		
		Card c2 = new Card("하트", "2");
		System.out.println(c2); // 하트(2)
	
		
		Card c3 = new Card("클로버", "j");
		System.out.println(c3); // 클로버(j)
		println(c3);
		
		CardDeck a = new CardDeck();
		
	}
	
	public static void println(String str) {
		System.out.println(str);
	}
	public static void println(Object obj) {
		//System.out.println("obj");
		String str = obj.toString();
		println(str);
	}

	
	
	
	
}	

