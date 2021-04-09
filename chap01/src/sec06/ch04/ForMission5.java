package sec06.ch04;

public class ForMission5 {
	public static void main(String[] args) {
		//2~9단 출력
		//단수마다 (빈칸)
		for(int i = 2; i<10; i++) {

			for(int z = 1; z<10; z++) {
				System.out.printf("%d * %d = %d\n", i, z, (i*z));
			}			System.out.println("");
		}
	}

}
