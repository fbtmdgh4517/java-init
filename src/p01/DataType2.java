package p01;

import java.util.Scanner;

public class DataType2 {

	public static void main(String[] args) {
		String str = "1234";
		System.out.println(str.length());
		System.out.println(str.substring(1));		//인덱스 1부터
		System.out.println(str.substring(1, 3));	//인덱스 1부터 3전까지
		
		int idx = str.indexOf("3");
		System.out.println("3의 인덱스 : " + idx);
		idx = str.indexOf("5");		// 없으면 -1
		System.out.println("5의 인덱스 : " + idx);
		
		Scanner scan = new Scanner(System.in);
	}

}
