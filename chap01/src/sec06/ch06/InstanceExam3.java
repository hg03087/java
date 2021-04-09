package sec06.ch06;

public class InstanceExam3 {
	public static void main(String[] args) {
		int mainNum=10;
		
		Box box1 = new Box();
		box1.num = 10;
		
		changeNum(mainNum);
		System.out.println("mainNum : " + mainNum);
		
		chageBoxNum(box1);
		System.out.println("box.num : " + box1.num);
	}

	public static void changeNum(int num) {
		num=20;
	}
	
	public static void chageBoxNum(Box box2) {      //위의 Box box와 다르지만 값은 같다
		box2.num=20;								  //box2 = new box();하면 상황은 달라짐		
	}
	
}

class Box {
	int num;
}