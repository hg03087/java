package sec06.ch07;

public class PolyMission {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Bus();
		Car car3 = new LocalBus();
		Car car4 = new Truck();
		
		blocklaxon(car1);
		blocklaxon(car2);
		blocklaxon(car3);
		blocklaxon(car4);
		//Bus, LocalBus 객체였다면 openDoor 메소드 호출
		//그외는 hoot 메소드 호출
	}

	private static void blocklaxon(Car a) {
		if(a instanceof Bus) {
			/*Bus bus =  (Bus)C;
			 * bus.openDoor();     //요게 더 많이 쓰이긴 함 
			 * */
			((Bus) a).openDoor();
		} else {a.hoot();}
		
	}
}
