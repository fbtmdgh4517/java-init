package p07;

public class FinalTest {
//	int for;  예약어는 변수명으로 사용 불가
	final int NUM = 1;		// 클래스? 메인 밖?에서는 상수명 전체 대문자
	final int NUM_TEST = 1;		// 카멜케이스를 쓸 수가 없어서 합성어는 단어사이에 밑줄
	
	public static void main(String[] args) {
		final int num = 1;		// 상수라서 변경 불가
//		num = 2;				// 오류
	}
}
