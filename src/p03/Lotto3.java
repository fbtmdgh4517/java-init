package p03;

import java.util.Random;
import java.util.Scanner;

public class Lotto3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int[] rNums = new int[6];
				
		for(int i=0; i<rNums.length; i++) {
			rNums[i] = random.nextInt(45) + 1;
		}
		
//		for(int i=0; i<rNums.length; i++) {
//			System.out.println(rNums[i]);
//		}
		
		System.out.print("1~45 숫자 6개 , 포함해서 입력하세요 : ");
		String str = scan.nextLine();
		String[] strs = str.split(",");
		int count = 0;
		
		for(int i=0; i<rNums.length; i++) {
			for(int j=0; j<strs.length; j++) {
				if(rNums[i] == Integer.parseInt(strs[j])) {
					count++;
				}
			}
		}
		
		System.out.println("맟춘 개수 : " + count);
	}

}
