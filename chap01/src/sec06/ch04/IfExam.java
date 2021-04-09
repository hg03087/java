package sec06.ch04;

public class IfExam {
	
	public static void main(String[]args) {
		int score = 93;
		
		if(score >= 90) {
			System.out.println("score가 90보다 크다");
			 System.out.println("등급a");
		}
		if (score < 90) {
			System.out.println("score가 90보다 작다");
			System.out.println("등급b");
		}
		System.out.println("끝");
		System.out.println("------------------------------");
		
		if(score >= 90) {
			System.out.println("score가 90보다 크다");
			 System.out.println("등급a");
		}
		else {
			System.out.println("score가 90보다 작다");
			System.out.println("등급b");
		}
		System.out.println("끝");
	}
	
}
