package p02;

public class AccessModifier {
	int b = 10;		// 클래스에서는 선언, 초기화만 가능하고 뭐 실행하는 건 안됨
	
	public static void main(String[] args) {
		int i = 1;
		System.out.println(i);
		AccessModifier am = new AccessModifier();		// b값을 읽을려면 그 값이 들어있는 클래스를 선언?해야됨
		System.out.println(am.b);
		AccessModifier am1 = new AccessModifier();		// 얘는 위에거랑 똑같은게 아님
		System.out.println(am1.b);
	}

}
