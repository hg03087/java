package sec06.ch06;

public class CapsuleExam {

	public static void main(String[] args) {
		Human h1 = new Human(); //나이는 12, 이름은 홍길동
		Human h2 = new Human();
		
		h1.setName("홍길동");
		h1.setAge(12);
		System.out.println("h1 이름 : " + h1.getName());
		System.out.println("나이 : " + h1.getAge());
		
		h2.setName("신사임당");
		h2.setAge(20);
		System.out.println("h2 이름 : " + h2.getName());
		System.out.println("나이 : " + h2.getAge());
			
		h1.whoAmI();
		h2.whoAmI();

	}

}
//setter - 생성자, 있어도 없어도 o 값을 넣을 때(쓰기), getter - 이건 거의 있음(읽기) 
//메소드 vs 생성자
//1.생성자 이름은 클래스 이름과 같아야 함
//2. 리턴 타입이 없음

//this()는 생성자 호출
class Human {
	private int age=10;
	private String name="미상";
	private final int MAX_AGE = 100;
	

	Human() {
		
	}
	
	Human(String name) {
		this.name = name;
	}
	
	Human(int age) {
		this.age = age;
	}
	
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setAge(int age) {
		this.age = age;
	} 
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	public void whoAmI() {
		System.out.printf("내 이름은 %s 나이는 %d 입니다\n", name, age );
	}
	
	public void whoAmI2() {
		System.out.printf("name : %s, age : %d \n", name, age );
	}
}
