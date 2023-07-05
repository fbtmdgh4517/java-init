package p08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LottoList {

	public static void main(String[] args) {
		List<Integer> lotto = new ArrayList<>();
		Random r = new Random();
		
		for(int i=0; i<6; i++) {
			int rNum = r.nextInt(45) + 1;
			
			if(lotto.indexOf(rNum) == -1) {
				lotto.add(rNum);
			} else {
				i--;
			}
		}
		
		for(int i=0; i<lotto.size(); i++) {
			System.out.println(lotto.get(i));
		}
	}
}
