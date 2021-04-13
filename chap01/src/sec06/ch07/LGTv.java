package sec06.ch07;

public class LGTv implements RemoteControl {
	private int volume;
	@Override
	public void VolumeUp() {
		volume++;
		
	}

	@Override
	public void VolumeDown() {
		volume--;
		
	}

	@Override
	public void chkVolume() {
		System.out.println("volume : " + volume);
		
	}

}
