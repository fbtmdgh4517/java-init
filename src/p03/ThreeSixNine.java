package p03;

public class ThreeSixNine {

	public static void main(String[] args) {
		for (int i=1; i<=100; i++) {
			// string
//			String str = Integer.toString(i);
//			
//			if(str.contains("3") || str.contains("6") || str.contains("9")) {
//				System.out.println("*");
//			} else if(i%5 == 0) {
//				System.out.println("만세");
//			} else {
//				System.out.println(i);				
//			}
			
			// int
			int num = i % 10;
			int num2 = i / 10;
			
			if((num != 0 && num % 3 == 0) || (num2 != 0 && num2 % 3 == 0)) {
				System.out.println("짝");
			} else {
				System.out.println(i);
			}
		}
	}

}
