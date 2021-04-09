package sec06.ch04;

public class ForMission4_ {
	
	public static void main(String[] args) {
		int dan = (int)(Math.random()*8)+2;
		for(int i = 6  ; i<15; i++) {
			System.out.printf("%d * %d = %d\n", dan, i-5, (dan*(i-5)));
		}
		//2~9사이의 랜덤값 추출
		
		//콘솔 (dan = 2)
		//2 * 1 = 2
		//2 * 2 = 4
		//~~~~~
		//2*9까지 4단도 마찬가지
		/*for(int i = 1; i<=9; i++) {
		System.out.println(dan+"*"+i+"="+dan*i);
		*/

		}
			
		
		
		
}

