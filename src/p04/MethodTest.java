package p04;

class Test {
	public static int getNum() {
		return 0;
	}
}

public class MethodTest {
	public static int getNum() {
		return 0;
	}
	
	public static String getStr() {
		return "";
	}
	
	public static void test() {
		return;		// 그냥 리턴은 되는데 무언가를 리턴은 못함
	}
	
	public static void main(String[] args) {
		int a = 1;
		int b = getNum();
		int c = Test.getNum();
		String str = getStr();
	}

}
