package sec06.ch05;
import java.util.Scanner;
public class VendingMachineMission3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		String[] menuNmArr = {"콜라", "사이다","환타", "스프라이트", "망고주스"};
		int[] menuPriceArr = {1000, 1200, 1300, 1500, 2000};
		
		int money1 = 0; //주입 금액
		int money2 = 0; //쭈욱 쓴 돈
		
		System.out.println("돈을 주입해 주세요");
		money1 = scan.nextInt();
		
		while(money1-money2>=0) {
			System.out.println("\n<menu>");
			for(int i=0; i<menuNmArr.length; i++) {
				System.out.printf("%d. %s (%d원)\n", i+1, menuNmArr[i],
						menuPriceArr[i]);				
			}
			System.out.println("선택>>");
			
			int choice = scan.nextInt();
			if(choice==0) {
				break;
			} else if(choice>0 && choice<=menuNmArr.length) {
				if(money1>=money2+menuPriceArr[choice-1]) {
				money2 +=  menuPriceArr[choice-1];
				System.out.printf("%s를 선택하셨습니다. (남은 금액 %d원)", menuNmArr[choice-1], (money1-money2));
				}else {
					System.out.println("잔액이 부족합니다. (남은 금액 %d원)"+(money1-money2));
				}
			} else {
				System.out.println("잘 못 선택하셨습니다");
			}
			
			}

			}
		}//end of while
		
		/*돈을 주입해 주세요 : 3000
		 * 콜라를 선택하였습니다. (남은 금액 2,000원)
		 * 금액이 부족합니다. (남은 금액 700원)
		 * */



	
	


