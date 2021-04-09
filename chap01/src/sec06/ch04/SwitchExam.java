package sec06.ch04;

public class SwitchExam {
	public static void main(String[]args) {
		int val = 2;
		switch(val) {
		case 1: 
			System.out.println("값은 1이다.");
			break ; //switch문 종료
		case 2:
			System.out.println("값은 2이다.");//두 줄 넣으면 두 줄 모두 출력
			break ;
		case 3:
			System.out.println("값은 3이다.");
			break ;
		default:
			System.out.println("ㄱ밧은 1~3이 아니다."); // 중간에 있던 어디 있던 위치 상관x
			break;
		}
		System.out.println("끝");
	}
}
