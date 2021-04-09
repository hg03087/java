package sec06.ch06;

public class StaticExam4 {
	public static void main(String[] args) {
		//calInstance2 객체화
		//num1 = 10, num2 = 20;
		//더한 값을 콘솔에 출력
		CalcInstance2 ci2 = new CalcInstance2();
		ci2.num1 = 10;
		ci2.num2 = 20;
		int result = ci2.sum();
		System.out.println(result);
		
		
		
		CalcStatic2.num1 = 20;
		CalcStatic2.num2 = 40;
		
		CalcStatic2 cs2 = new CalcStatic2();
		
		int result2 = cs2.sum();
		System.out.println(result2);
		
		String.format("%d", result);
		String str = new String();
		str.format("%d", result);
		
		
}
}
class CalcStatic2 {
	static int num1;
	static int num2;
	static int sum() {
		return num1 + num2;
	}
}

class CalcInstance2 {
	static int num1;                    //static이 안붙은건 무적권 객체화
								//메소드 안에 없으면 전역변수				
	int num2;					//스태틱을 안쓴 멤버필드면 스태틱x
	int sum() {
		return this.num1 + num2;
	}
	
	static int sum(int num1, int n2) {
		return CalcInstance2.num1+n2;
	}
	
}