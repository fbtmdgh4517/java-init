package p08;

public class AircornRemocorn extends Remocorn {
	// 생성자는 데이터타입 있으면 안됨. 있으면 메소드로 인식함. 인터페이스는 생성자를 만들 수 없음
	public AircornRemocorn() {
		System.out.println("에어콘 리모콘에 건전지");
	}
	
	public void on() {
		System.out.println("에어콘을 킵니다.");
	}
	
	public void off() {
		System.out.println("에어콘을 끕니다.");
	}
	
	public void tempUp() {
		System.out.println("온도를 올린다.");
	}
	
	public void tempDown() {
		System.out.println("온도를 내린다.");
	}
}
