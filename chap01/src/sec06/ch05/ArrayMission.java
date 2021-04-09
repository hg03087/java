package sec06.ch05;

public class ArrayMission {
	public static void main(String[] args) {
		//정수형 배열 생성 (10칸 짜리)
		//모든 방에 정수값 20을 세팅해 주세요 (for문 활용)
		int[] intArr = new int[100];

		intArr[0] = 20;
		intArr[1] = 20;
		intArr[2] = 20;
		intArr[3] = 20;
		intArr[4] = 20;
		intArr[9] = 20;
		
		System.out.println(intArr); //주소값만 
		System.out.println(intArr[9]);
		
		for(int i=0; i<intArr.length; i++) { //intArr.length 숫자 말고 이거 쓰기
		intArr[i] = 20;
		
		}
		
		for(int i=0; i<intArr.length; i++) {
			System.out.printf("intArr[%d] : %d\n", i, intArr[i]);
		}
	}
}
