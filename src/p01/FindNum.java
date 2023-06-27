package p01;

import java.util.Random;
import java.util.Scanner;

public class FindNum {

	public static void main(String[] args) {
		Random r = new Random();
		int rNum = r.nextInt(3) + 1;
		Scanner scan = new Scanner(System.in);
		for(int i=1; i<=3; i++) {
			System.out.print("맞출 숫자를 입력 : ");
			String str = scan.nextLine();
			int num = Integer.parseInt(str);
			if(rNum == num) {
				System.out.println("맞췄구먼~~");
			} else {
				System.out.println("틀렸구먼~~");
			}
		}
	}

}
