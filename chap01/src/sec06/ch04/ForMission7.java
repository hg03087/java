package sec06.ch04;

public class ForMission7 {
	public static void main(String[] args) {
		int star = (int)(Math.random()*5)+3; //3~7
		System.out.println("number"+star);
		for(int i =1; i <= star; i++) {

			for(int z=1; z<= i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//star = 3
		//*
		//**
		//*** 요런 느낌
		

		}
	}

