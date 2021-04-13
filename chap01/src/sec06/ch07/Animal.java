package sec06.ch07;

public abstract class Animal {
	private int age;
	private String name;						//추상 메소드 
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}        
	
	public void breath() {
		System.out.println("숨쉰다");
	}
	public abstract void howling();
}

abstract class Cat extends Animal {
	
}
class cat extends Animal {

	@Override
	public void howling() {
		System.out.println("멍멍");
		
	}
	
}
