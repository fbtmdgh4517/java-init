package p07;

public class ThisClass {

	String name = "경동대";
	
	public void printName() {
		String name = "민국대";
		System.out.println(name);
		System.out.println(this.name);		// 같은 이름으로 다른 영역에 있는 변수를 사용할 수 있음
	}
	
	public static void main(String[] args) {
		ThisClass tc = new ThisClass();		// 메모리 생성
		tc.printName();
	}
}
