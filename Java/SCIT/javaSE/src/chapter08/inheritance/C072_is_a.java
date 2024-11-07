package chapter08.inheritance;

class Animal {
	String name;
	void move() {
		System.out.println("움직이다");
	}
}

class Person extends Animal {
	String name;

	@Override
	void move() {
		System.out.println("두 발로 걷다");
		// super.move();
	}
	
}

public class C072_is_a {

	public static void main(String[] args) {
/*
 	is a relation
 	상속 관계, 다중 상속 X
 	다형성 
 */
		
		Animal a = new Animal(); // 동물은 동물이다
		a.move();
		Person b = new Person(); // 사람은 사람이다 
		b.move();
		Animal c = new Person(); // 사람은 동물이다
		c.move();
//		Person d = new Animal(); // 동물은 사람이다
		

	}

}
