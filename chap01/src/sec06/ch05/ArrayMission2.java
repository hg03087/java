package sec06.ch05;

public class ArrayMission2 {
	public static void main(String[] args) {
		int[]intArr = new int[10];

				for(int i=0; i<intArr.length; i++) {
					intArr[i] = i+1 ;
				}

				for(int i=0; i<intArr.length; i++) {
					System.out.printf("intArr[%d] : %d\n", i, intArr[i]);
		//정수형 배열 생성 (10짜리)
		//1~10값이 순차적으로 대입 (for문 사용)
		//각방의 값을 콘솔 출력 (for문 사용)
		//입력과 출력은 분리
	}	
	}
}