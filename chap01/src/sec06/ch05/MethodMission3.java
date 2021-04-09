package sec06.ch05;

public class MethodMission3 {

	public static void main(String[] args) {
		sumAllFromTo(5, 10);    //sum : 45
		
		sumAllFromTo(2, 4);     //sum : 9
		
		sumAllFromTo(1, 100);
		
		sumAllFromTo(4, 2);

		
				
	}
	
	public static void sumAllFromTo( int n1, int n2) {//보이드면 값을 담을 그릇 마련 비보이드면 리턴 값 받아주고
		int sum = 0;
		for(int i=n1; i<= n2; i++) {
			sum += i;
		}
		System.out.println("sum : "+ sum);
		}
	}


