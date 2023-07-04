package p07;

public class Constructure {

	public Constructure() {		// 생성자, 생성자 안 만들면 보이지 않는 기본 생성자가 만들어짐(아무것도 실행안됨), 아래거 만들고 이거 지우고 메인에서 이거 실행하면 오류
		System.out.println("어?");
	}
	
	public Constructure(int num) {		// 오버로딩
		System.out.println("어? int num?");
	}
	
	public static void main(String[] args) {
		Constructure c = new Constructure();		// 생성 하자마자 위에 실행됨
		
	}
}
