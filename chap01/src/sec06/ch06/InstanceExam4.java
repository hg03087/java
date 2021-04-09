package sec06.ch06;

public class InstanceExam4 {
	public static void main(String[] args) {
		Car a = new Car();
		Car b = new Car();
		
		a.name = "소나타";
		a.cc = 2000;
		b.name = "911";
		b.cc = 5000;
		a.drive();
		a.stop();
		System.out.println();
		b.drive();
		b.drive();
		//car객체화 2개
		//첫번째 차의 name은 "소나타", cc는 2000
		//두번째 차의 name은 "911", cc는 5000
		//첫번째 차량 drive한다
		//첫번째 차량 stop한다
	}
}

class Car {
	String name;
	int cc;
	
	void drive() {
		System.out.printf("%s는 달린다 ", name);
	}

	void stop() {
		System.out.printf("%s는 멈춘다 ", name);
	}
}