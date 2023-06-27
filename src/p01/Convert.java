package p01;

public class Convert {

	public static void main(String[] args) {
		int i = 1;
		String s = "1";
		String s1 = i + "";
		System.out.println(s.equals(s1));
		
		int i1 = Integer.parseInt(s);
		System.out.println(i == i1);
		
		String str = "백이십";
		int i2 = Integer.parseInt(str);		// 숫자로된 문자열만 파스 가능
		System.out.println(i2);
	}

}
