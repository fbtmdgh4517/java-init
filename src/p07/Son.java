package p07;

public class Son extends Father {		// extends Object 생략 되어있음
	public String hobby;
	
	public void printHobby() {
		System.out.println(name + "님의 취미는 " + hobby + "입니다.");
	}
}
