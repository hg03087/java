package sec06.ch04;

public class IfExam2 {
	public static void main(String[] args) {
		int score = 75; //69, 71, 79, 81, 90, 91 
		
		if(score >= 90) { // 90~
			System.out.println("등급 a");
		} else if(score>=80) { //80~89
			System.out.println("등급b");
		} else if(score >=70) { // 70~79
			System.out.println("등급c");
		} else {
			System.out.println("등급d");
		}
		System.out.println("끝");
	}

}
