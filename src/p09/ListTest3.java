package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest3 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		Random r = new Random();
		
		while(numList.size() < 50) {
			int rNum = r.nextInt(200) + 1;
			if(numList.indexOf(rNum) == -1 && rNum % 2 != 0) {	// 홀수인지 먼저 확인하는게 더 빠름
				numList.add(rNum);
			}
//			if(rNum % 2 == 0 || numList.indexOf(rNum) != -1) continue;
//			numList.add(rNum);
		}
		
		for(int i=0; i<numList.size(); i++) {
			System.out.println(numList.get(i));
		}
	}
}
