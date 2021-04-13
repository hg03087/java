package sec06.ch07.starcraft;

public class Marine implements Bionic{
	private int currentHp = 10;
	public final int MAX_HP = 20;
	
	public int getCurrentHp() {
		return currentHp;
	}
	public void setCurrentHp(int currentHp) {
		this.currentHp = currentHp;
	}
}
