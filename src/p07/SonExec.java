package p07;

class Song {
	public int rank;
	public String title;
	
	public void printTitle() {
		System.out.println("노래 제목 : " + title);		// title이 오류 안나는 이유, title, printTitle 이 둘다 static이 아니라서
	}
	
	public static void printSomething() {
//		System.out.println("노래 제목 : " + title);		// title이 오류나는 이유, static 메소드는 static 변수만 쓸 수 있음, 보통 메소드는 static 변수 쓸 수 있음
	}
}

public class SonExec {

	public static void main(String[] args) {
//		Father f = new Son();
//		Object o = new Son();
//		Object o1 = new String("123");
		Son s = new Son();
		s.name = "동동";		// Father에서 상속받은 변수
		s.job = "개발자";
		s.age = 30;
		s.hobby = "게임";		// 원래 내 변수
		s.printJob();		// Father에서 상속받은 메소드
		s.printHobby();		// 원래 내 메소드
		Father f = new Father();
		f.name = "동동이";
		Son s2 = (Son)f;		// 오류
		s2.hobby = "낚시";
//		Father f = new Son();		// f는 hobby(son의 변수)를 사용할 수 없음
//		f.name = "같은거임";
//		Son s2 = (Son)f;
//		s2.hobby = "투자";
//		System.out.println(s2.name);
	}
}
