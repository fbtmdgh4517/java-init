package p07;

public class Game {
	public String name;
	public int price;
	public String genre;
	
	public void start() {
		System.out.println(name + "을(를) 시작합니다.");
	}
	
	public void playing() {
		System.out.println(name + "을(를) 플레이하는 중입니다.");
	}
	
	public void stop() {
		System.out.println(name + "을(를) 종료합니다.");
	}
}
