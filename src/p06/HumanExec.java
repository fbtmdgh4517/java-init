package p06;

public class HumanExec {

	public static void main(String[] args) {
		Human h1 = new Human();
		h1.name = "류승호";
		h1.age = 33;
		
		Human h2 = new Human();
		h2.name = "김승호";
		h2.age = 13;
		
		Human h3 = new Human();
		h3.name = "이승호";
		h3.age = 22;
		
		Human h4 = new Human();
		h4.name = "박승호";
		h4.age = 41;
		
		Human h5 = new Human();
		h5.name = "최승호";
		h5.age = 67;
		
		Human[] humans = new Human[5];
		
		humans[0] = h1;
		humans[1] = h2;
		humans[2] = h3;
		humans[3] = h4;
		humans[4] = h5;
		
		int maxAge = humans[0].age;
		int minAge = humans[0].age;
		
		Human oldHuman = humans[0];
		Human youngHuman = humans[0];
		
		for(int i=1; i<humans.length; i++) {
			if(humans[i].age > maxAge) {
				maxAge = humans[i].age;
				oldHuman = humans[i];
			} else if(humans[i].age < minAge) {
				minAge = humans[i].age;
				youngHuman = humans[i];
			}
		}
		
		int sum = 0;
		for(int i=0; i<humans.length; i++) {
			sum += humans[i].age;
		}
		
		int avgAge = sum / humans.length;
		int avgGap = Math.abs(humans[0].age - avgAge);
		
		Human avgHuman = humans[0];
		
		for(int i=1; i<humans.length; i++) {
			if(Math.abs(humans[i].age - avgAge) < avgGap) {
				avgHuman = humans[i];
			}
		}
		
		System.out.println("가장 나이 든 사람 : " + oldHuman.name + " (" + oldHuman.age + ")");
		System.out.println("가장 젊은 사람 : " + youngHuman.name + " (" + youngHuman.age + ")");
		System.out.println("평균 나이 : " + avgAge);
		System.out.println("평균 근접 사람 : " + avgHuman.name + " (" + avgHuman.age + ")");
	}

}
