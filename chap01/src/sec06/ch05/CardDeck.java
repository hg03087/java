package sec06.ch05;

import sec06.ch06.blackjack.Card;

public class CardDeck {
 String[] pt = {"Spades", "Hearts", "Diamonds", "Clubs"};
 String[] sb = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
private static final Card[] CARD_ARR = new Card[52];


 public CardDeck() {
	 int i =0;
	 for(String pt : pt) {
		 for(String sb : sb) {
			 CARD_ARR[i++]=new Card(pt,sb);
		 }
	 }
	 
 }
 
 void printAll() {
	 for(Card c : CARD_ARR) {
		 System.out.println(c);
	 }
 }
}
