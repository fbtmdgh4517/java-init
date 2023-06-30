package p05;

public class HumanExec {

	public static void main(String[] args) {
		Human h1 = new Human();
		h1.name = "류승호1";
		h1.money = 1000;
		
		Human h2 = new Human();
		h2.name = "류승호2";
		h2.money = 2000;
		
		Human h3 = new Human();
		h3.name = "류승호3";
		h3.money = 3000;
		
		Human h4 = new Human();
		h4.name = "류승호4";
		h4.money = 4000;
		
		Human h5 = new Human();
		h5.name = "류승호5";
		h5.money = 5000;
		
		Human[] humans = new Human[5];
		humans[0] = h1;
		humans[1] = h2;
		humans[2] = h3;
		humans[3] = h4;
		humans[4] = h5;
		
		
		int chongMoney = 0;
		int avgMoney = 0;
		
		for(int i=0; i<5; i++) {
			chongMoney += humans[i].money;
		}
		
		avgMoney = chongMoney / humans.length;
		System.out.println("5명이 가진 총액 : " + chongMoney);
		System.out.println("5명의 평균 액 : " + avgMoney);
		
		String names = "";
		
		for(int i=0; i<5; i++) {
			if(humans[i].money > avgMoney) {
				names += humans[i].name + " (" + humans[i].money + "원)" + ", ";
//				System.out.println("평균 액 보다 많은 돈을 갖고 있는 사람 : " + humans[i].name + " (" + humans[i].money + "원)");
			}
		}
		
		names = names.substring(0, names.length() - 2);
		System.out.println("평균보다 많은 사람 : " + names);
	}

}
