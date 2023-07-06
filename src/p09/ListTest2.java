package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest2 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		Random r = new Random();
		
		while(numList.size() < 20) {
			int rNum = r.nextInt(100) + 1;
			if(numList.indexOf(rNum) == -1) {
				numList.add(rNum);
			}
		}
		
//		for(int i=0; i<numList.size(); i++) {
//			int num = numList.get(i);
//			int mod = num % 10;
//			int quo = num / 10;
//			if(mod == 3 || mod == 6 || mod == 9 || quo == 3 || quo == 6 || quo == 9) {
//				if((mod == 3 || mod == 6 || mod == 9) && (quo == 3 || quo == 6 || quo == 9)) {
//					System.out.println(num + " : 짝짝");
//				} else {
//					System.out.println(num + " : 짝");					
//				}
//			} else {
//				System.out.println(num);
//			}
//		}
		
		for(int i=0; i<numList.size(); i++) {
			String numStr = numList.get(i).toString();
			numStr = numStr.replace("3", "짝");
			numStr = numStr.replace("6", "짝");
			numStr = numStr.replace("9", "짝");
			System.out.println(numList.get(i) + " : " + numStr);
		}
		
//		for(int i=0; i<numList.size(); i++) {
//			String strNum = Integer.toString(numList.get(i));
//			if(strNum.contains("3") || strNum.contains("6") || strNum.contains("9")) {
//				if(numList.get(i) == 33 || numList.get(i) == 36 || numList.get(i) == 39 || 
//					numList.get(i) == 63 || numList.get(i) == 66 || numList.get(i) == 69 || 
//					numList.get(i) == 93 || numList.get(i) == 96 || numList.get(i) == 99) {
//					System.out.println("짝짝");
//				} else {
//					System.out.println("짝");					
//				}
//			} else {
//				System.out.println(numList.get(i));
//			}
//		}
	}
}
