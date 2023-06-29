package p04;

import java.util.Random;

public class MethodTest2 {

	public static int getRandomNum(int max) {
		Random r = new Random();
		
		return r.nextInt(max) + 1;		//nextInt()의 데이터 타입이 int라서 1을 더할 수 있음
	}
	
	public static void main(String[] args) {
		System.out.println(getRandomNum(1));
		System.out.println(getRandomNum(1));
		System.out.println(getRandomNum(1));
		System.out.println(getRandomNum(1));
		System.out.println(getRandomNum(1));
		System.out.println(getRandomNum(1));
		System.out.println(getRandomNum(1));
	}

}
