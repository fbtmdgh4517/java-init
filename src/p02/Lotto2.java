package p02;

import java.util.Random;

public class Lotto2 {

	public static void main(String[] args) {
		int[] rNums = new int[6];
		Random r = new Random();		// 랜덤 모듈 임포트 해줘야됨
		
		for(int i=0; i<rNums.length; i++) {
			rNums[i] = r.nextInt(45) + 1;		// 랜덤 정수 0~44까지인데 +1 해서 1~45까지 할 수 있음
		}
		
		for(int i=0; i<rNums.length; i++) {
			System.out.println("rNums[" + i + "] : " + rNums[i]);
		}
	}

}
