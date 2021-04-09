package sec06.ch05;

public class MethodMission2 {
	public static void main(String[] args) {
		int n1 = 10, n2 = 3;
		double result = divide(10, 3);
		System.out.println("result : " + result); //3.3333
		
		n2 = 5;
		result = divide(n1, n2);
		System.out.println("result : "+result);// 2.0
		
		int abs = abs(10);
		System.out.println("절대 값 : " + abs(10)); //10
		System.out.println("절대 값 : " + abs(-10));//10
		System.out.println("절대 값 : " + abs(7)); //7
		System.out.println("절대 값 : " + abs(-7)); //7
		
	}
	public static int abs(int n1) {
		if(n1<0) {
			return (n1 * -1);
		}return n1;
			
		
	}
	
	public static double divide(int n1, int n2) {  //n1타입이 int이면 int로 받아주기
		return (double)n1/n2;
	}
	
}
