package p07;

public class OverLoading {
	// public(같은 프로젝트, 같은 패키지 누구나 쓸 수 있음?) protected(같은 패키지만되는데 다른 패키지에서는 상속 받으면 됨) default private
	public void test() {
		System.out.println("test() 호출");
	}
	
	public void test(byte b) {
		System.out.println("test(byte b) 호출");
	}

	public void test(short s) {
		System.out.println("test(short s) 호출");
	}
	
	public void test(int num) {
		System.out.println("test(int num) 호출");
	}
	
	public void test(long l) {
		System.out.println("test(long l) 호출");
	}
	
	public void test(float f) {
		System.out.println("test(float f) 호출");
	}
	
	public void test(double d) {
		System.out.println("test(double d) 호출");
	}

	public void test(String str) {
		System.out.println("test(String str) 호출");
	}
	
	public void test(char c) {
		System.out.println("test(char c) 호출");
	}
	
	public void test(boolean b) {
		System.out.println("test(boolean b) 호출");
	}
	
	public void test(int num, String str) {
		System.out.println("test(int num, String str) 호출");
	}

	public void test(String str, int num) {		// 파라미터의 데이터타입, 개수가 같아도 순서가 다르면 오류 안남
		System.out.println("test(String str, int num) 호출");
	}
	
	public static void main(String[] args) {
		OverLoading ol = new OverLoading();
		ol.test((byte)1);
		ol.test((short)1);
		ol.test(1);
		ol.test(1L);
		ol.test(2.2f);
		ol.test(2.2);
		ol.test("asd");
		ol.test('a');
		ol.test(true);
	}
}
