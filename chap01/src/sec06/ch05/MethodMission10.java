package sec06.ch05;
import java.util.Scanner;

import sec06.ch06.Drink;
public class MethodMission10 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] menuNmArr = {"콜라", "사이다","환타", "스프라이트", "망고주스", "포도주스"};
		int[] menuPriceArr = {1000, 1200, 1300, 1500, 2000, 3000};
		
		Drink[] drinkArr = new Drink[6];
		
		for(int i=0; i<drinkArr.length; i++) {
			Drink drink = new Drink();
			drink.nm = menuNmArr[i];
			drink.price = menuPriceArr[i];
			
			drinkArr[i] = drink;
		}
		
		
		printMenu3(drinkArr);
		

		

		/*
		 * for(int i=0; i<drinkArr.length; i++) { Drink drink = drinkArr[i];
		 * System.out.printf("%d. %s (%,d원)\n", i+1, drink.nm, drink.price); }
		 * 
		 * for(int i=0; i<drinkArr.length; i++) { System.out.println(drinkArr[i].nm); }
		 * 
		 * printMenu(menuNmArr, menuPriceArr); boolean run = true; while(run) {
		 * 
		 * } //리턴타입 boolean 즉 true, false만 됨
		 * 
		 * 
		 * System.out.println("끝");
		 */
	}
	
	//0번 입력
	public static boolean chooseMenu(Scanner scan, int len) {
		System.out.println("<선택>");
		int selectedNum = scan.nextInt();
		return true;
	}
	
	public static void printMenu(String[] n1, int[] n2) {
		System.out.println("<menu>");
		for(int i=0; i<n1.length; i++) {
			System.out.printf("%d. %s (%d원)\n",(i+1),n1[i], n2[i] );
		}
	}
	
	public static void printMenu2(String[] n1, int[] n2) {
		String str = "<메뉴>\n";
		str += "0.종료\n";
		for(int i=0; i<n1.length; i++) {
			str += String.format("%d. %s (%d원)\n",(i+1),n1[i], n2[i] );
		}
		System.out.println(str);
		}
	
	
	public static void printMenu3(Drink[] drink ) {
		for(int i=0; i< drink.length; i++) {
			
			System.out.printf("%d. %s (%d원)\n",i+1,drink[i].nm,drink[i].price);
		}
	}
	}



