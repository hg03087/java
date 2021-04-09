package sec06.ch06;

public class InstanceExam2 {

	public static void main(String[] args) {
		Dog d1 = new Dog() ;                //d2를 만들어도 new를 통해 사실 하나만 만들어진 것
		Dog d2 = d1;
		
		d1.name = "뽀삐";
		d2.name = "휴지";
		
		d1.bark();

	}

}
