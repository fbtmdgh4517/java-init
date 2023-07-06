package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest1 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		Random r = new Random();
		
//		for(int i=0; i<6; i++) {
//			int rNum = r.nextInt(100) + 1;
//			
//			if(numList.indexOf(rNum) == -1) {
//				numList.add(rNum);
//			} else {
//				i--;
//			}
//		}
		
		while(numList.size() < 6) {
			int rNum = r.nextInt(100) + 1;
			
			if(numList.indexOf(rNum) == -1) {
				numList.add(rNum);
			}
		}
		
		for(int i=0; i<numList.size(); i++) {
			System.out.println(numList.get(i));
		}
		
		int maxNum = numList.get(0);
		int minNum = numList.get(0);
		
		for(int i=1; i<numList.size(); i++) {
			if(maxNum < numList.get(i)) {
				maxNum = numList.get(i);
			} else if(minNum > numList.get(i)) {
				minNum = numList.get(i);
			}
		}
		
		System.out.println("max : " + maxNum);
		System.out.println("min : " + minNum);
	}
}
