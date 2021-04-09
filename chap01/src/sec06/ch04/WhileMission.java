package sec06.ch04;

public class WhileMission {
	public static void main(String[] args) {
		//1~100까지 합계
		int i = 1;
		int sum = 0;
			
		
		while(i<101) {
			sum = sum+i;
			
			i++;
		}
		
		System.out.println(sum);
	}
}
