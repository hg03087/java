package sec06.ch05;

public class MethodMission4 {
	public static void main(String[] args) {
		int rnum = getRandomNum(); //0~9
		System.out.println("rnum : " + rnum);
		
		rnum = getRandomNum(20); //0~19
		rnum = getRandomNum(5); //0~4
		
		rnum = getRandomNum(5, 10); //5~10
		rnum = getRandomNum(10, 20); //10~20
	}
	
	public static int getRandomNum(int min, int max) {
		int hun = (int)(Math.random()*(min+1) + min);
		System.out.println(hun);
		return hun;
		
		
	}
	
	public static int getRandomNum(int n1) {
		int ran = (int)(Math.random()*10);

		System.out.println(ran);
		return ran;
	}
	
	public static int getRandomNum() {
		int n1 = (int)(Math.random()*10);
		return n1;
	}
}
