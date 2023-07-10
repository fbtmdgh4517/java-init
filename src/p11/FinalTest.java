package p11;

class Test {	// final 클래스는 상속 안됨
	public final void test() {	// final 메소드는 오버라이딩 안됨
		System.out.println("난 Test꺼");
	}
}

public class FinalTest extends Test {
//	public final void test() {
//		System.out.println("난 FinalTest");
//	}
	
	public static void main(String[] args) {
		
	}
}
