package sec06.ch06;

public class CnstructorExam1 {
		//객체지향 언어는 모든 생성자를 사용한다 
		//생성자는 객체가 만들어질 때 무조건 호출을 해야한다
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.brand = "samsung";
		tv.inch = 100;
		tv.maxChannel = 100;
		tv.maxVolume = 100;
		tv.displayState();
		//samsung 100inch 100channel 100volume
		
		Tv tv2 = new Tv("LG", 120, 300, 200);
		tv2.displayState();
		/*tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.displayVolume(); //현재 볼륨 : 3
		tv2.displayVolume();
		*/
	}
}
//같은 class는 같은 패키지 안에 못넣음
class Tv {
	String brand;
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;
	
	Tv() {}
	
	Tv(String brand, int inch, int maxChannel, int maxVolume) {
	}
	void displayState() {
		System.out.printf("브랜드 : %s %d 인치 채널 %d 볼륨 제한 %d\n", brand, inch, maxChannel, maxVolume);
	}
	
	
	//기본 생성자 - 컴파일러가 생성자가 하나도 없을 때만
	//생성자 vs 메소드
	//이름은 클래스명과 같다
	//리턴타입이 없다
	//생성자는 객체 생성할때만 사용할 수 있음
	
	void volumeUp() {
		int currentVolume = 0;
		this.currentVolume++;           //this - 자기 자신의 주소값
	}
	
	void displayVolume() {

			System.out.printf("현재 볼륨은 %d입니당",currentVolume);
		} 
	}
	



