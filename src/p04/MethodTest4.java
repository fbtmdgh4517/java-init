package p04;

public class MethodTest4 {
	// 메서드는 기능을 저장하기 위해 사용
	// 변수는 다양한 값을 저장하기 위해 사용, 고정된 값을 저장하기 위한거라면 상수
	public static int[] getLotto() {
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			int rNum = MethodTest2.getRandomNum(45);
			
			for(int j=0; j<i; j++) {
				if(lotto[i] == rNum) {
					i--;
					break;
				}
			}
			
			if(lotto[i] == 0) {
				lotto[i] = rNum;				
			}
		}
		
		return lotto;
	}
	
	public static void printLotto(int[] lotto) {
		for(int i=0; i<lotto.length; i++) {
			System.out.println("lotto[" + i + "] = " + lotto[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] lotto = getLotto();
		
		printLotto(lotto);
	}

}
