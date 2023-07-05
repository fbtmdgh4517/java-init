package p07;

class Mother {
	public void work() {
		System.out.println("어머님이 집안일을 하십니다.");
	}
}

class Daughter extends Mother {
	public void work() {
		System.out.println("딸이 출근을 합니다.");
	}
	
	public void work(String job) {
		System.out.println("딸이 " + job + "을 합니다.");
	}
}

public class Overriding2 {
	public static void work(Mother[] ms) {
		for(int i=0; i<ms.length; i++) {
			Mother m = ms[i];
			m.work();
			if(m instanceof Daughter) {
				Daughter d = (Daughter)m;
				d.work("개발");
			}
		}
	}
	public static void main(String[] args) {
		Daughter d = new Daughter();
		
		Mother m = new Mother();
		
		Mother[] ms = new Mother[2];
		ms[0] = d;
		ms[1] = m;
		
		work(ms);
		
//		System.out.println(d instanceof Mother);	// d를 Mother라고 불러도 되나 Daughter가 Mother을 상속 받아서 true
//		System.out.println(m instanceof Mother);	// '' true
//		
//		System.out.println(d instanceof Daughter);
//		System.out.println(m instanceof Daughter);
	}
}
