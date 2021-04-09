package sec06.ch04;
import java.util.Scanner;
public class Exercise7 {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔금 | 4. 종료");
			System.out.println("---------------------");
			System.out.println("선택>");
			
			int cash = scanner.nextInt();
			   /* 
			    * case 1 :
			     	System.out.println("입금액 >" );
			     	balance = balance + scan.nextInt();  switch문 활용
			     	break;
			     	*/                                    
			if(cash == 1) {
				System.out.println("예금 : " );
				cash = scanner.nextInt();
				balance +=cash;
			}else if(cash == 2) {
				System.out.println("출금 : ");
				cash = scanner.nextInt();
				balance -=cash;
			}else if(cash == 3) {
				System.out.println("잔금 : " + balance);
			}else {
				System.out.println("종료");
				continue;
			}
				
		}
		
		System.out.println("프로그램 종료");
	}
}
