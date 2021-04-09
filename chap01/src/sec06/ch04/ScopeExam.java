package sec06.ch04;

public class ScopeExam {
	public static void main(String[] args) {
		
		//스코프 (변수와 상수가 살아있는 범위)
		
		int a = 10;
		
		if(a > 9) {
			System.out.println("a : " + a);
			
			int jjj = 10;
			System.out.println("jjj(1) : " + jjj);
		}
		System.out.println("jjj(2) : " );
		
		for(int i = 0; i <10; i++) {
			
		}
		if(true) {
			int i = 10;
		}//중괄호 넘어가면 변수가 죽음
	}	
	
}
