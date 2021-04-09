package sec06.ch04;

public class ForMission8 {
	
	public static void main(String[] args) {
			int star = (int)(Math.random()*5)+3; //5
			System.out.println("star : "+star);
			
			for(int i = 1; i <= star; i++) { //5번
				for(int z = 0; z <= star-i; z++) { //0~4 5번 , 1번 
					System.out.print("*");	       //1~4 4번
				}
				System.out.println();
			}
	}
}
