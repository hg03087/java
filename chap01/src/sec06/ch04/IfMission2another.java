package sec06.ch04;

public class IfMission2another {
	//여자 평균키 : 163
	//남자 평균키 : 175
	
	public static void main(String[] args) {
		String gender = "여"; //"여" 	
		int height = 167;
		final int MAN_STAND = 175;
		final int WOMAN_STAND = 163;
		int stand = MAN_STAND;

		/*
		System.out.println(gender.equals("남"));
		System.out.println(gender.equals("여"));
		*/

		if(gender.equals("여")) {
			stand = WOMAN_STAND;
			
			if(height > stand) {
				System.out.println("평균 초과");
			} else if(height == stand) {
				System.out.println("평균");
			} else {
				System.out.println("평균 미만");
			}				
		}else {
			System.out.println("측정할 수 없습니다");
		}
	}
}
		//남, 170 > 평균 미만
		//남, 175 > 평균
		//남, 176 > 평균 초과
		//여, 162 > 평균 미만
		//여, 163 > 평균
		//여, 164 > 평균 초과
		
	

