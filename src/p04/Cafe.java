package p04;

public class Cafe {

	public static String getCoffee(String order, int price, int money) {
		if(money < price) {
			return "주문하신 " + price + "원 짜리 " + order + "가 준비되었는데 너는 " + money + "원을 줬다. " + (price - money) + "원을 더 줘야한다.";
		} else if(money > price) {
			return "주문하신 " + price + "원 짜리 " + order + "가 준비되었다. " + (money - price) + "원 잔돈이 남았다.";
		}
		return "주문하신 " + price + "원 짜리 " + order + "가 준비되었습니다.";			
	}
	
	public static void main(String[] args) {
		String coffee = getCoffee("아아", 2000, 5000);
		System.out.println(coffee);
		String coffee2 = getCoffee("아아", 6000, 5000);
		System.out.println(coffee2);
		String coffee3 = getCoffee("아아", 5000, 5000);
		System.out.println(coffee3);
	}

}
