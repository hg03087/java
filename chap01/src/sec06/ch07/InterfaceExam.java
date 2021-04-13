package sec06.ch07;

public class InterfaceExam {
	public static void main(String[] args) {
		RemoteControl rc1 = new LGTv();
		RemoteControl rc2 = new SamsungTv();
		
		rc1.VolumeUp();
		rc2.VolumeUp();
		
		rc1.chkVolume();
		rc2.chkVolume();
		
		
		
		
		
		
		/*LGTv TV1 = new LGTv();
		RemoteControl rc = tv1;
		//rc.welcome();
		rc.VolumeUp();
		tv1.VolumeUp();
		rc.VolumeDown();
		rc.chkVolume();*/
		
	}
}
