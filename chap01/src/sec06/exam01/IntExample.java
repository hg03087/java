package sec06.exam01;
/*
 * 정수 모두 정리(4가지)
 */
public class IntExample {
	public static void main(String[] args) {
		char c = 'a';  //문자 하나만 저장 가능
		byte b = 10; //1L
		short s = 20; //2L 
		int i = 30; //4L
		long l = 40; //8L
		
		//자동형변환
		s = b;
		s = (short)i; // 문제가 될 경우에는 안쓰 시거나
		 		      // 강제형변환
	}
}
