package sec06.ch04;

public class SwitchExam2 {
	public static void main(String[]args) {
		String habbit = "수영"; //if는 ㄴㄴ, 문자열 쓸땐 switch가 편안
		
		switch(habbit) {
		case "수영": case"등산":
			System.out.println("건강한 취미입니다");
			break;
		case"술":
		case"담배":
			System.out.println("불건전한 취미입니다.");
			break;
		}
	}
}
