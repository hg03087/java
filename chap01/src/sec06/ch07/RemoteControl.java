package sec06.ch07;

public interface RemoteControl {
	int AGE = 10;               //자동적으로 파이널 붙음
								//private 같은 클래스
	public void VolumeUp();		//명령만 있지 구현부는 없음
	abstract void VolumeDown();
	void chkVolume();
}

