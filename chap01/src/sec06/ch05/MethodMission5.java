package sec06.ch05;

public class MethodMission5 {

	//중복된 소스 최대한 제거
	//메소드 재활용
	public static void main(String[] args) {
		int star = 5;
		printStarLine(star);
		printStarSquare(star);// ***** 쭈욱 내려가
		printStarTri(star); //*피라미드
		

	}
	public static void printStarLine(int n1) {
		for(int i=0; i<n1; i++) {
			System.out.print("*");
		}
	}
	
	
	public static void printStarSquare(int n1) {
			for(int z=0; z<n1; z++) {
				printStarLine(n1);                          //alt 방향키: 줄 위아래로 이동 
				System.out.println();                       //shift home, end: 모든 줄 지정
			}	
		}
		
	public static void printStarTri(int n1) {
		for(int q=1; q<=n1; q++) {
			printStarLine(q);                           
			System.out.println(); 
		}
	}
}


