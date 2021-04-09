package sec06.ch04;

public class LableLoopExam {
	public static void main(String[] args) {
		OUTER:
		for(int i=0; i<3; i++ ) {
			
			INNER:
			for(int z=100; z<105; z++) {
				System.out.printf("%d - %d \n", i, z);
				
				if(z == 103) {
					break; //break 뒤에 이름 지정해서 선택 박살 가능, + continue : 반복문만 사용가능
				}
			}
			System.out.println("끝");
		}
	}
}
