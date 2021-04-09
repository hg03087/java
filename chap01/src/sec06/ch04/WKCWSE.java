package sec06.ch04;
import java.util.Scanner;
public class WKCWSE {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int speed = 0;
		System.out.println("----------------");
		System.out.println("1. 중속 | 2. 감속 | 3. 중지");
		System.out.println("----------------");
		while(true) {

			System.out.println("선택 : ");
			int inputVal = scan.nextInt();
			
			if(inputVal == 1 ) {speed++;}
			else if(inputVal == 2) {speed--;}
			else if(inputVal == 3) {break;}
			else {
				System.out.println("1~3까지 입력");
				continue;
			}
			System.out.println("현재속도" +speed);
		}
		System.out.println("끝");
		scan.close();
	}
	
}
