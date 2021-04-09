package sec06.ch04;

public class IfMission {
	public static void main(String[] args) {
		int score = 69;
		
		if(score < 70) { //~69
			System.out.println("등급 d");
		} else if(score <80) { // 70~79
			System.out.println("등급c");
		} else if( score <90) { // 80~89
			System.out.println("등급b");
		} else { // 90 ~
			System.out.println("등급a");
		}
		System.out.println("끝");
	}

}
