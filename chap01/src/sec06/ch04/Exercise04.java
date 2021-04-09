package sec06.ch04;

public class Exercise04 {
	public static void main(String[] args) {
		/*while문과 Math.random()메소드를 이용해서 두 개의 주사위를 던졌을 때 
		 * 나오는 누능르 (눈1,눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고,
		 * 눈의 합니 5이면 실행을 멈추는 코드
		 * 눈의합이 5가 되는 조합은 (1,4) (4,1) (2,3) (3,2)
		 * 눈 값의 범위는 1~6*/
		

		while(true) {
			int n1 = (int)(Math.random()*6)+1;
			int n2 = (int)(Math.random()*6)+1;
			System.out.printf("(%d,%d)\n", n1,n2);
			if(n1+n2 ==5) {
				break;	
			}
			}
		}
			
	}

