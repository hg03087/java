package sec06.ch05;

public class MethodExam {
	public static void main(String[] args){
		int result = sum(10, 20);         //이름이 sum 소괄호 안은 아규먼트(인자)
		System.out.println("result : "+result);
		
		result = minus(20, 10);
		System.out.println("minus -result : "+ result);
	}//(리턴타입) main(메소드명)(String[] args)(파라미터()매개변수)) { //메인 메소드
		
	public static int minus(int aaa, int b) {
		return aaa - b;
	}
	
	public static int sum(int n1, int n2) {   //중괄호 이전 메소드 선언부, 중괄호 이후는 구현구
		return n1 + n2;
	
	}
	
}
