package sec06.ch06;

public class InstanceExam5 {

	public static void main(String[] args) { //대문자 주솟값 소문자 리터럴값
		Car[] carArr = new Car[5];          //Car타입의 배열 레퍼런스 타입의 배열 각 칸은 null이 뜬다
		carArr[0] = new Car();
		
		carArr[0].name = "그랜저";				//각방은 car타입 Car객체만 저장 가능

	}

}
