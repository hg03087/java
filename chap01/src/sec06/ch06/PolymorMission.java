package sec06.ch06;

public class PolymorMission {

	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal pig = new Pig();
		Animal hamster = new Hamster();
		
		Hamster hhh = (Hamster)pig;
		
		System.out.println(hamster instanceof Hamster);  //왼쪽 주소값이 오른쪽 타입으로 형변환이 가능한지
		System.out.println(pig instanceof Hamster);
		//새롭게 햄스터 객체 만들지 않고,
		//8번 라인의 hamster변수애 저장된 주소값을 활용하여 
		//runRail 메소드 호출
		Hamster ham = (Hamster)hamster;
		hamster.runRail();
		ham.runRail();
		
		cry(cat);
		cry(pig);
		cry(hamster);
		
		//PolymorMission.cry(cat);
		//PolymorMission.cry(pig);
		//PolymorMission.cry(hamster); 만일 static 뺀다면 객체화

	}
	 static void cry (Animal animal) {
		animal.howling();
	}

}


class Pig extends Animal {
	@Override
	void howling() {
		System.out.println("꿀꿀");
	}
}

class Hamster extends Animal {
	@Override
	void howling() {
		System.out.println("찍찍");
	}
}