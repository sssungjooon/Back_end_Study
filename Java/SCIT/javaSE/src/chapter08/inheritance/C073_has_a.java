package chapter08.inheritance;

class Human3 {
	Tool tool; // 변수로 Tool 을 가지기
	
	Human3(String toolName) {
		tool = new Tool(toolName);
	}
	
	void use() {
		System.out.println(tool.name + "을/를 사용하다");
	}
}

class Tool {
	String name;
	
	Tool(String name) {
		this.name = name;
	}
}

public class C073_has_a {

	public static void main(String[] args) {
/*
 		has a relation
 		포함, 구성 관계
 */
		Human3 h = new Human3("파이어스틸");
		System.out.println(h.tool.name);
		h.use();
	}
	
}

// 결합도
// Aggregation (집합 관계) - 약한 소유권 
class Car {
	private Engine engine;
	
	public Car(Engine engine) {
		this.engine = engine; 
	}
	public void assembleCar(Engine engine) {
		this.engine = engine;
	}
}

class Engine {	}

// Composition {구성 관계} - 강한 소유권
class House {
	private Room rooms = new Room();
}
class Room { }