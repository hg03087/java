package sec06.ch04;

public class SwitchMission2 {
	public static void main(String[] args) {
		String pos = "과장";
		
		// pos값이 "부장"이면 "700만원"
		// pos값이 "과장"이면 "500만원"
		//나머지 pos값은 "300만원"
		switch(pos) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default : 
			System.out.println("300만원");
		}
	}
}
