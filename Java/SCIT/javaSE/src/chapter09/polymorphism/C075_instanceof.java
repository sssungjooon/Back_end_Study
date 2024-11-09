package chapter09.polymorphism;

class Dog extends Animal {
	void bark() {
		System.out.println("멍멍");
	}
}

class Dove extends Animal {
	void fly() {
		System.out.println("퍼득");
	}
}

public class C075_instanceof {

	public static void main(String[] args) {
		Dog a = new Dog();
		a.move();
		a.bark();
		testAnimal(a);
		System.out.println();
		
		Animal b = new Dog();
		b.move();
//		b.bark(); // err 
		testAnimal(b);
		System.out.println();
		
		Animal c = new Dove();
		c.move();
		testAnimal(c);
		System.out.println();
		
		Animal d = new Animal();
		
//		System.out.println(a instanceof Dog);
//		System.out.println(a instanceof Dove);
		System.out.println(b instanceof Animal);
		System.out.println(b instanceof Dog);
		System.out.println(c instanceof Animal);
		System.out.println(c instanceof Dove);
		System.out.println(d instanceof Dog);
		System.out.println(d instanceof Dove);
		
	}
	
	static void testAnimal(Animal animal) {
		if (animal instanceof Dog) {
			Dog mydog = (Dog) animal;
			mydog.bark();
		}
		if (animal instanceof Dove) {
			Dove mydove = (Dove) animal;
			mydove.fly();
		}
	}

}
