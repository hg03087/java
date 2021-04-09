package sec06.ch06;

public class InstanceExam {
	
	public static void main(String[] args) {	//대문자로 시작하는 건 레퍼런스 변수  
		Dog d1 = new Dog();
		Dog d2 = new Dog();		//new: 객체화를 시켜줌   

		d1.name = "뽀삐";
		d2.name = "휴지";
		d1.bark();
		d2.bark();
	}											// new dog만 해도 객체화 되지만 일회성				
}
//멤버필드 (값을 저장할 수 있는 것) - 명사 담당,
//멤버메소드 (값을 수정할 수 있는 것) - 동사 담당
class Dog {
	String name;
	String jong;                          //멤버필드 종류, 갯수 무한대
	int age;
	
	void bark() {
		System.out.printf("%s가 멍멍\n", name);
	}
}
