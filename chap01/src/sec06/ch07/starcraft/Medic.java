package sec06.ch07.starcraft;

public class Medic implements Bionic{
	private int currentHp = 3;
	public final int MAX_HP = 15;
	
	public int getCurrentHp() {
		return currentHp;
	}
	public void setCurrentHp(int currentHp) {
		this.currentHp = currentHp;
	}
	
	public void heal(Object unit) {
		if(unit instanceof Bionic) {
			if(unit instanceof Marine) {
			Marine marine = (Marine)unit;
			marine.setCurrentHp(marine.MAX_HP);
		}else if(unit instanceof Medic) {
			Medic medic = (Medic)unit;
			medic.setCurrentHp(medic.MAX_HP);
		}
		return;
	}
	System.out.println("치료할 수 없습니다");
}
}