package sec06.ch04;

public class ForMission5_1 {
	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			
			for(int z=2; z<10; z++) {
				System.out.printf("%d * %d = %d\t", z, i, (z*i) );
			}System.out.println();
		}
		
			
		// \t사용 : tab누른만큼 띄워주기	\n은 개행
		//2*1=2 3*1=3 4*1=4...9*1=9
		//2*2=4 3*2=6 4*2=8...9*2=18
		//~~~
		//2*9=18 3*9=27...9*9=81 
	}
}
