package chapter06.class_part1;

class Car { // 클래스 생성, 정의 
	// 멤버 변수
	String name;
	boolean gasoline;
	
	// 멤버 메서드
	void run() {
		if (gasoline) {
			System.out.println("부릉부릉");
		} else {
			System.out.println("덜컹덜컹");
		}
	}
	
	void stop() {
		System.out.println("끼익");
	}
}

public class C042_class_basic1 {

	public static void main(String[] args) {
		Car korando = new Car();
		korando.name = "코란도C";
		korando.gasoline = false;
		System.out.print(korando.name + " : ");
		korando.run();
		
		Car equus = new Car();
		equus.name = "에쿠스";
		equus.gasoline =true;
		System.out.print(equus.name + " : ");
		equus.run();
		equus.stop();

	}

}
