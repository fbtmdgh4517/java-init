package p02;

import java.util.Scanner;

public class GuGuDan2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		String numStr = scan.nextLine();
		
		int num = Integer.parseInt(numStr);		// 입력 받은 숫자가 String이라서 정수로 바꿔야됨
		for(int i=1; i<=9; i++) {
			System.out.println(i + " X " + numStr + " = " + i * num);
		}
	}

}
