package p05;

// Food.java를 활용한 실행파일
public class FoodExec {
	
	public static void printFood(Food[] foods) {
		for(Food f : foods) {
			System.out.println("음식 : " + f.name);
			System.out.println("가격 : " + f.price + "원");
			System.out.println("종류 : " + f.type);			
		}
	}
	
	public static void main(String[] args) {
		Food f = new Food();
		
		f.name = "삼겹살";
		f.price = 15000;
		f.type = "한식";
		
		Food f1 = new Food();
		
		f1.name = "돼지";
		f1.price = 12000;
		f1.type = "한식";
		
		Food f2 = new Food();
		
		f2.name = "치킨";
		f2.price = 18000;
		f2.type = "야식";
		
		Food f3 = new Food();
		
		f3.name = "자장면";
		f3.price = 7000;
		f3.type = "중식";
		
		Food f4 = new Food();
		
		f4.name = "짬뽕";
		f4.price = 7000;
		f4.type = "중식";
		
//		Food[] 형태가 아니라서 오류남
//		printFood(f);
//		printFood(f1);
//		printFood(f2);
//		printFood(f3);
//		printFood(f4);
		
		Food[] foods = new Food[5];		// 2차원 배열임 Food에 변수가 3개 있어서
		
		foods[0] = f;
		foods[1] = f1;
		foods[2] = f2;
		foods[3] = f3;
		foods[4] = f4;
		
		printFood(foods);
		
	}
}
