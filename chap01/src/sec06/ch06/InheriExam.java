package sec06.ch06;


public class InheriExam {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.howling();
		Animal ani = new Animal("D", 14);
		
		//KoShort koshort = new KoShort();
		

	}
}

class Animal extends Object {
	String name;
	int age;
	Animal() {}
	Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;  
		}                
		void howling() {
			System.out.println("운다");
	}
		public void runRail() {
			
			
		}


	
}

class Cat extends Animal {
	Cat() {
		super("", 0);
	}
	void lick() {
		System.out.printf("%s가 핥다", name);
	}
	@Override
	void howling() {
		System.out.println("야옹");
}
}

class Hamster extends Animal {
	public void runRail() {
		System.out.println("챗바퀴를 굴린다");
	}
//ani로 Hamster 객체 주소값이 들어오면
//howling 메소드 말고
//runRail 메소드 호출해주세요
//다른 객체들은 howling 메소드 호출
static void cry(Animal ani) {
	ani.howling();
}

class KoShort extends Cat {
	KoShort() {
		super();
		System.out.println("KoShort 생성자");
	}
	void pee() {
		System.out.printf("%s가 소변을 본다", name);
	}
}
}



























