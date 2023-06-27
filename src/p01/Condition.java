package p01;

public class Condition {

	public static void main(String[] args) {
		int age = 10;
		boolean isEleven = age == 11;		// 오른쪽 실행하고 왼쪽에 대입
		
		if(isEleven) {
			System.out.println("11살");
		} else if(age == 10) {
			System.out.println("10살1");
		} else if(age == 10) {
			System.out.println("10살2");
		} else if(age == 10) {
			System.out.println("10살3");
		} else {
			System.out.println("11살이 아니군");
		}
	}

}
