package p03;

import java.util.Random;

public class Lotto2 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] rNums = new int[7];
		
		rNums[0] = random.nextInt(40) + 1;
		
		for(int i=1; i<rNums.length; i++) { 
			int rNum = random.nextInt(40) + 1;
			
			for(int j=0; j<i; j++) {
				if(rNums[j] == rNum) {
					i--;
					break;
				}
			}
			
			if(rNums[i] == 0) {
				rNums[i] = rNum;
			}
		}
		
		for(int i=0; i<rNums.length; i++) {
			System.out.println("rNums["  + i + "] = " + rNums[i]);
		}
	}

}
