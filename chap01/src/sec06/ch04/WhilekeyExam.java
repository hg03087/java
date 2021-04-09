package sec06.ch04;

public class WhilekeyExam {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keycode = 0;
		
		while(run) {
			if(keycode != 13 && keycode != 10) {
				System.out.println("----------------");
				System.out.println("1. 중속 | 2. 감속 | 3. 중지");
				System.out.println("----------------");
				System.out.println("선택 : ");
			}
			keycode = System.in.read();
			//System.out.println("keycode : " + keycode);
			
			if(keycode == 49) {
				speed++;
				System.out.println("현재속도 : " + speed);
			} else if(keycode == 50 ) {//키보드의 2번 key
				speed--;
				System.out.println("현재속도 : " + speed);
			} else if(keycode == 51) { // 키보드의 3번 key
				run = false;
			}
			}
		}
	
}
