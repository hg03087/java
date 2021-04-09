package sec06.ch05;

import java.util.Scanner;

public class MethodMission7 {
	//남자 평균키: 175, 여자 평균키163
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = null;
		
		do {
			System.out.print("성별 :");
			String gender = scan.next(); //남, 여
			
			
			System.out.print("키 :");
			int height = scan.nextInt();
			
			String result = chk(gender, height);
			System.out.println(result);
			
			
			//성별 : 남, 키:170cm, 평균미만
			//성별 : 여, 키:163cm, 평균
			
			System.out.print("계속 하시겠습니까? (y, n)");
			answer = scan.next();
		} while(!answer.equals("y"));
		System.out.println("끝");
		scan.close();
	}
	
	public static String chk(String n1, int n2) {

		if(n1.equals("남")) {
			if(n2<175) {
				return "평균미만";
			}else if(n2==175) {
				return "평균";
			}else {
				return "평균초과";
				}
		}else if(n1.equals("여")) {
			if(n2<163) {
				return"평균미만";
			}else if(n2==163) {
				return "평균";
			}else {
				return "평균초과";
			}
		}else {
			System.out.println("측정불가");
		}
		return "null"; 
	}															//System.out.print -- 실무에서 잘 안씀
																//return String.format -- 요걸 많이 씀	
}



	/*public static String chk(String n1, int n2) {
	int stand = 163;
	String result = "평균";
	
	switch(gender) {
	case "남":
		stand = 175;
		break;
	default:
		return "성별을 잘못입력하셨습니다";
	}
}
*/





















