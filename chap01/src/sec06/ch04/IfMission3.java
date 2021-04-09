package sec06.ch04;

public class IfMission3 {
	public static void main(String[] args) {
		final int SCORE = (int)(Math.random() * 20)+81;
		System.out.println("SCORE : " + SCORE);
						//SCORE 값은 81~100점 사이의 값이 된다. (실행할때마다 달라진다)
		
		//91~100A (97점 이상은 A+, 96~94 "A", 93~91 "A-")
		//81~90(87점 이상은 B+, 86~84 "B", 83~81 "B-")
		//나머지 C
		String grade = (SCORE >90) ? "A" : "B";
		int result = SCORE % 10;
		
		if(result >=7|| result ==0) {
			grade += "+";
			} else if (result <4) {
				grade += "-";
			}
			System.out.println(grade);
			
	}
}
























