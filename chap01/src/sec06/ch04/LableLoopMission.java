package sec06.ch04;

public class LableLoopMission {
	public static void main(String[] args) {
		//n1,n2값이 8이 되면 모든 for 종료
		//n1,n2값이 같아지면 n1을 올린다
		OUTER:
		for(int n1=1; n1<=9; n1++) {
			if(n1 == 8) {
				break;
			}//if(n1 == n2 && n2 ==8) 이걸로 함수 줄이자
			for(int n2=0; n2<=9; n2++) {
				if(n2 == 8) {
					break;
				}
				else if(n1==n2) {
					System.out.println();
					continue OUTER;
				}
				System.out.printf("%d%d\n", n1, n2);
			}
		}
		System.out.println("끝");
	}
}
