package sec06.ch06;

public class PolymorExam {

	public static void main(String[] args) {
		Animal ani_1 = new Cat();  //부모타입의 변수는 자식객체를 가리킬 수 있다.
		//Cat cat1 = new Animal(); 자식타입의 변수는 부모객체 가리킬 수 없다.
		//Cat cat1 = (Cat)new Animal("", 0); 자식타입의 변수는 부모객체 가리킬 수 없다.
		Cat cat = (Cat)ani_1;
		
		Animal ani_2 = cat;
		
		ani_1.howling();
		//ani_1.lick();
		cat.howling();		
		cat.lick();
		System.out.println("끝");

	}

}
