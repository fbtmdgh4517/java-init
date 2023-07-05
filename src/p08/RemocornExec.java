package p08;

public class RemocornExec {

	public static void main(String[] args) {
//		AircornRemocorn ar = new AircornRemocorn();	// 에어컨리모콘, 리모콘, 리모트라고 부를 수 있음
//		TVRemocorn tv = new TVRemocorn();
//		Remote r1 = ar;
//		Remote r2 = tv;
		Remote[] remotes = new Remote[2];
		remotes[0] = new AircornRemocorn();
		remotes[1] = new TVRemocorn();
		
		for(int i=0; i<remotes.length; i++) {
			remotes[i].on();
			if(remotes[i] instanceof AircornRemocorn) {
				AircornRemocorn ar = (AircornRemocorn)remotes[i];
				ar.tempUp();
				ar.tempDown();				
			} else if(remotes[i] instanceof TVRemocorn) {
				TVRemocorn tv = (TVRemocorn)remotes[i];				
				tv.chUp();
				tv.chDown();
			}
			remotes[i].off();
		}
		
	}
}
