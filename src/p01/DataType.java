package p01;

public class DataType {
	
	public static void main(String[] args) {
		char c = '1';		// 쌍따옴표는 String, 한따옴표는 char 
		byte b = 1;
		
		int i = 1;
		short s = (short)i;		// int 크기가 short보다 커서 이렇게 해야됨, 반대 상황이면 상관 무
		
		int i2 = 1000000000;		// 숫자 너무 크면 오류, 뒤에 뭐 없어도 됨
		long l = 10000000000L;		// long은 숫자 맨 뒤에 대문자 L
		
		float f = 1.1F;				// float는 숫자 맨 뒤에 대문자 F
		double d = 1.1;				// 뒤에 뭐 없어도 됨
		boolean bl = true;
	}
}
