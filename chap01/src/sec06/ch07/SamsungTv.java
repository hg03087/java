package sec06.ch07;

public class SamsungTv  implements RemoteControl {
		private int sound;
		@Override
		public void VolumeUp() {
			sound+=2;
			
		}

		@Override
		public void VolumeDown() {
			sound-=2;
			
		}

		@Override
		public void chkVolume() {
			System.out.println("sound : " + sound);
			
		}
}