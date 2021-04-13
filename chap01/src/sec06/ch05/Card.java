package sec06.ch05;

public class Card {
	public static void main(String[] args) {
		Card c1 = new Card("spade", "k");
		System.out.println(c1);
		Card c2 = new Card("heart", "2");
		System.out.println(c2);
	}
	private String pt;
	private String sb;
		
	public Card(String pt, String sb) {		
		this.pt = pt;
		this.sb = sb;
	}
	
	public String getPattern() {
		return this.pt;
	}
	
	public String getSymbol() {
		return sb;
	}
	
	@Override
	public String toString() {
		return String.format("%s (%s)", pt, sb);
	}
	
}