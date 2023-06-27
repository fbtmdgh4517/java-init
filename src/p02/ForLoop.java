package p02;

public class ForLoop {

	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
			System.out.println("1 X " + i + " = " + 1*i);
		}
		
		System.out.println("==========");
		
		for(int i=1; i<=9; i++) {
			System.out.println(i + " X 1" + " = " + 1*i);
		}
		
		System.out.println("==========");
		
		for(int i=9; i>=1; i--) {
			System.out.println(i + " X 1" + " = " + i*1);
		}
	}

}
