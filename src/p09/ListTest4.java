package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest4 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 3개를 ,를 기준으로 입력해주세요 : ");
		String numStr = scan.nextLine();
		String[] numStrs = numStr.split(",");
		
		for(int i=0; i<numStrs.length; i++) {
			numList.add(Integer.parseInt(numStrs[i]));
		}
		
		for(int i=0; i<numList.size(); i++) {
			System.out.println(numList.get(i));
		}
		
		System.out.print("숫자 3개를 ,를 기준으로 입력해주세요 : ");
//		String numStr2 = scan.nextLine();
//		String[] numStrs2 = numStr2.split(",");		굳이 새로 안 만들어도 됨
		numStr = scan.nextLine();
		numStrs = numStr.split(",");
		int cnt = 0;
		
		for(int i=0; i<numList.size(); i++) {
			if(numList.contains(Integer.parseInt(numStrs[i]))) {	// indexOf 해서 해도 됨
				cnt++;
			}
		}
		
//		for(int i=0; i<numStrs.length; i++) {
//			int num = Integer.parseInt(numStrs[i]);
//			for(int j=0; j<numList.size(); j++) {
//				if(num == numList.get(j)) {
//					cnt++;
//				}
//			}
//		}
		
		System.out.println("맞은 개수 : " + cnt);
	}
}
