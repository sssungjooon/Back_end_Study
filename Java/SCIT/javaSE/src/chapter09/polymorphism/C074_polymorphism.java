package chapter09.polymorphism;

class Animal {
	void move() {System.out.println("동물이 움직입니다.");}
}

class Human extends Animal {
	@Override
	void move() {
		System.out.println("사람이 두발로 걷습니다");
	}
}

class Tiger extends Animal {
	@Override
	void move() {
		System.out.println("호랑이가 네발로 뜁니다");
	}
}

class Eagle extends Animal {
	@Override
	void move() {
		System.out.println("독수리가 하늘을 납니다");
	}
}

public class C074_polymorphism {

	public static void main(String[] args) {
		move(new Animal()); //Animal a = new Animal();
		move(new Human()); //Animal b = new Human();
		move(new Tiger()); //Animal c = new Tiger();
		move(new Eagle()); //Animal d = new Eagle();

	}
	
	public static void move(Animal animal) {
		animal.move(); 
		
		/*
		 	다형성을 사용하기 때문에 아래 메서드들처럼 일일히 만들 필요가 없다.
		 	Animal 안에 Human, Tiger, Eagle이 포함되기 때문 
		 */
	}
	
//	public static void moveHuman(Human human) {
//		human.move();
//	}
//	
//	public static void moveTiger(Tiger tiger) {
//		tiger.move();
//	}
//	
//	public static void moveEagle(Eagle eagle) {
//		eagle.move();
//	}

}
