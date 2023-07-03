package p06;

class Car {
	public String name;
	public static String type;
}

public class InstanceTest {

	public static void main(String[] args) {
		Car.type = "승용차";		// 스태틱은 new로 안 만들고 쓸 수 있음
		
		Car sonata = new Car();
		System.out.println(sonata.name);		// 눌
		
		sonata.name = "소나타";
		System.out.println(sonata.name);		// 소나타
		
		sonata = new Car();
		System.out.println(sonata.name);		// 눌
		
		sonata = null;
		System.out.println(sonata.name);		// 눌 포인터 익셉션
	}
}
