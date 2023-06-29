package p04;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {
	
	public static int getRandom(int max) {
		Random r = new Random();
		int rNum = r.nextInt(max) + 1;
		
		return rNum;
	}
	
	public static boolean match(int num1, int num2) {
		if(num1 == num2) {
			return true;
		}
		if(num1 > num2) {
			System.out.println("Down");
		}
		if(num1 < num2) {
			System.out.println("Up");
		}
		return false;
	}

	public static void main(String[] args) {
		int rNum = getRandom(50);
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		while(!match(num, rNum)) {
			System.out.print("1~50 : ");
			num = Integer.parseInt(scan.nextLine());
		}
		
		System.out.println("맞췄다.");
	}

}
