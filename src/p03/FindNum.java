package p03;

import java.util.Random;
import java.util.Scanner;

public class FindNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		boolean correct = false;
		int rNum = random.nextInt(10) + 1;
		int count = 0;
		
		while(!correct) {
			System.out.print("1부터 10까지 숫자 입력하세요 : ");
			int inputNum = Integer.parseInt(scan.nextLine());
			count++;
			
			if(inputNum == rNum) {		// correct = inputNum == rNum
				System.out.println("맞췄다");
				System.out.println(count + "번 만에 맞췄다");
				correct = true;
			}
		}
	}

}
