package sec06.ch04;

public class Exercise {

	public static void main(String[] args) {
		//for문을 이용해 1~100까지 정수 중 3의 배수 총합
		int sum = 0;
		for(int i=1; i<100; i++) {
			if(i%3 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

}
