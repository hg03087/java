package sec06.ch05;

public class MethodMission8 {
	public static void main(String[] args) {
		gugudan(8);    //구구단 8단
		
		gugudan(4,8); //단 바뀔 때 ----, or 개행 구분자 사용
	}
	public static void gugudan(int n1) {
		for(int i=1; i<10; i++) {
			System.out.printf("%d*%d = %d",n1,i,n1*i);
			System.out.println();
		} 
	}
	
	public static void gugudan(int n1, int n2) {
		for(int i=n1; i<=n2; i++) {
			gugudan(i);
			System.out.println("-------------------");
		}
	}
}
