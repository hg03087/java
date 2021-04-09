package sec06.ch04;

public class ForMission9 {
	public static void main(String[] args) {
//		int star = 5;
//		for(int i = 1; i<=5; i++) {
//			for(int z = 1; z <= star-i; z++ ) {
//				System.out.print("_" );	
//			}
//			for(int q = 1; q<=i; q++) {
//			System.out.print("*");
//			}
//			System.out.println();
//		}
		
		int star = 10;
		int o = star/2; //2
		for(int i = -o; i<=o; i++) { //-2,-1,0,1,2
			int k=0;
			for(int j = 1; j <= star-Math.abs(i); j++ ) {
				String result = k < Math.abs(i)? "_":"*";
				System.out.print(result);
				k++;
			}
			
			System.out.println();
		}
		

		//____*
		//___**
		//__***
		//_****
		//***** 어케하노
	}
}

