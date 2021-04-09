package sec06.ch05;

public class MethodMission6 {

	public static void main(String[] args) {
		int score = getRandomScore(50, 100); //50~100사이 랜덤 세팅
		
		char grade = getGrade(score); //90점 이상 a 80 b 70 c 60 d 나머지 e
		char grade2 = getGrade2(score);//한자리 숫자대 8이상 이거나 00이면 +, 3이하이면 - , 나머지 빈칸
		
		System.out.printf("%d : %c%c\n", score, grade, grade2);
	}
	public static int getRandomScore(int n1, int n2) {
		int score = (int)(Math.random()*(n2-n1+1)+n1);
		return score;
	}
	public static char getGrade(int score) {
		if(score>=90) {
			return 'a';
		}else if(score>=80) {
			return 'b';
		}else if(score>=70) {
			return 'c';
		}else if(score>=60) {
			return 'd';
		}else {
			return 'e';
		}
	}
	
	public static char getGrade2(int score) {            //char: 단일 문자
		if(score%10>=8 || score%10 == 0) {
			return '+';
		}else if(score%10<=3) {
			return '-';
		}else {
			return ' ';
		}
	}
}
