package sec06.ch05;
import java.util.Scanner;
public class VendingMachineMission_ {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); //************************
		
		String[] menuNmArr = {"콜라", "사이다","환타", "스프라이트", "망고주스"};
		int[] menuPriceArr = {1000, 1200, 1300, 1500, 2000};
		
		
		while(true) {
			System.out.println("\n <menu>");
			for(int i = 0; i<menuNmArr.length ; i++) {
				System.out.printf("%d. %s (%,d원)\n",
						 (i+1), menuNmArr[i], menuPriceArr[i]);
			}
			System.out.println("선택");
			int choice = scan.nextInt();
			
			if(choice == 0) {
				break;
			} else if(choice >= 1 && choice <= menuNmArr.length) {
				System.out.printf("%s를 선택하셨습니다\n", menuNmArr[choice-1]);
			} else {
				System.out.println("잘 못 선택하셨습니다");
			}
		}
		System.out.println("종료" );
		scan.close();
		}

		
		
	}//end of main
	
	
	

//end of class
