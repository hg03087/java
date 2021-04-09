package sec06.ch06;

public class PolymorMission {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Pig pig = new Pig();
		Hamster hamster = new Hamster();
		
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