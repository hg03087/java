package sec06.ch07;

public class Car {
	public void hoot() {
		System.out.println("빵빵");
	}
	
}

class Bus extends Car {
	public void openDoor() {
		System.out.println("승객문을 열다");
	}
}

class LocalBus extends Bus {
	@Override
	public void hoot() {
		System.out.println("LocalBus bang bang");
	}
}

class Truck extends Car {
	@Override
	public void hoot() {
		System.out.println("truck bang bang");
	}
}