package p02;

public class Lotto {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			int rNum = (int)(Math.random() * 45 + 1);		//Math.random()은 0부터 0.99999~까지 실수라서 정수로하려면 int로 변환하거나 처음부터 double로 쓰거나
			lotto[i] = rNum;			
		}
		
		for(int i=0; i<lotto.length; i++) {
			System.out.println("lotto[" + i + "] : " + lotto[i]);
		}
	}

}
