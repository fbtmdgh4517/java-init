package p06;

public class AnimalExec {
	
	public static void print(Animal[] animals) {
		for(int i=0; i<animals.length; i++) { 
			Animal animal = animals[i];
			
			animal.run();
			if(!animal.name.equals("고양이")) {
				animal.hunt();
			}
			if("새".equals(animal.type)) {		// animal.type이 없으면 오류나서 animal.type.equals("새") 하면 안됨
				animal.fly();
			}
			animal.eat();
		}
	}

	public static void main(String[] args) {
//		static 안에서 static 밖에 못슴, static이면 new 안해도 되는데 아니면 new 해야됨(인스턴스화)
		Animal tiger = new Animal();
		tiger.name = "호랑이";
		tiger.type = "호랑이";
		
		Animal cat = new Animal();
		cat.name = "고양이";
		cat.type = "고양이";
		
		Animal bird = new Animal();
		bird.name = "새";
		bird.type = "새";
		
		Animal[] animals = new Animal[3];
		
		animals[0] = tiger;
		animals[1] = cat;
		animals[2] = bird;
		
		print(animals);
	}

}
