package sec06.ch07.starcraft;

public interface Mechanic{
	private int currentHp = 3;
	public final int MAX_HP = 15;
	
	public int getCurrentHp() {
		return currentHp;
	}
	
}
