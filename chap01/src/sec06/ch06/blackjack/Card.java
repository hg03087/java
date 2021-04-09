package sec06.ch06.blackjack;

public class Card {
		private String pt_arr;
		private String sb_arr;

		public Card(String Pattern, String Symbol) {
			this.pt_arr = Pattern;
			this.sb_arr = Symbol;
		}
		public String getPattern() {
			return this.pt_arr;
		}
		public String getSymbol() {
			return this.sb_arr;
		}
		@Override
		public String toString() {
			return	String.format("%s(%s)", pt_arr, sb_arr);
		}
}
