package sec06.ch04;

public class ForMission6 {
	public static void main(String[] args) {
		int star = (int)(Math.random()*5)+3; //3~7
		
		System.out.println("star number: "+ star);
		for(int i = 1; i<=star; i++ ) { //i<=star star 값에 따라 몇번 돌지 결정
		
			for(int j=1; j<=star; j++){
				System.out.print("*");
			}
			
			System.out.println();
			}
		
		
		//3~7 사이 랜덤값
		//star = 3 (별이 3칸 3줄)
		//***
		//***
		//***
	}
}
