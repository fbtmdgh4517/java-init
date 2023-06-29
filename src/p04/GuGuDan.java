package p04;

import java.util.Scanner;

public class GuGuDan {

	public static void printGugudan(int dan, int dan2) {
		for(int i=1; i<=dan; i++) {
			System.out.println(i + "단");
			
			for(int j=1; j<=dan2; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
			
			System.out.println("===================");
		}		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("출력할 단1을 입력 : ");
		int dan = Integer.parseInt(scan.nextLine());
		System.out.print("출력할 단2을 입력 : ");
		int dan2 = Integer.parseInt(scan.nextLine());
		printGugudan(dan, dan2);
	}

}
