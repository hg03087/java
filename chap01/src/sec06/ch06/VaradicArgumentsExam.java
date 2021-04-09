package sec06.ch06;

public class VaradicArgumentsExam {
	public static void main(String[] args) {
		Calc2 cal = new Calc2();
		int result = cal.sum(new int[] {10, 20});   //만들자마자 바로 세팅
		System.out.println("result : " + result);
		result = cal.sum(10,20);
		System.out.println("result : " + result);

		result = cal.sum(10,20,30);
		System.out.println("result : " + result);

		result = cal.sum(10,20,30,40);
		System.out.println("result : " + result);

		result = cal.sum(10,20,30,40,50);
		System.out.println("result : " + result);

	}
}

class Calc2 {
	int sum(int...vals) {               //int형 배열로 받아서 해결
		int sum = 0;
		for(int i=0; i<vals.length; i++) {
			sum += vals[i];
		}
		return sum;		
	}
}