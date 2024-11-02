package chapter06.class_part1;

/*
 	싱글턴 패턴
 	단 하나의 인스턴스만 생성되도록 보장하는 디자인 패턴
 	가장 기본적인 방법은 private 생성자와 static 메서드를 사용하는 것.
 */

class Singleton {
	// 인스턴스를 아직 생성하지 않음
	private static Singleton instance;
	// private의 접근 범위를 가지는 기본 생성자
	// = 외부에서 인스턴스를 생성할 수 없음
	
	private Singleton() {
		System.out.println("기본 생성자 호출");
	}
	
	// 인스턴스를 1개만 만들 수 없음
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void printMethod() {
		System.out.println("인스턴스로부터 메서드 호출");
	}
	
}

public class C053_singletonPattern {

	public static void main(String[] args) {
//		Singleton sg = new Singleton(); // Singleton이 private한 메서드라 에러뜸
		
		Singleton st1 = Singleton.getInstance();
		st1.printMethod();
		
		Singleton st2 = Singleton.getInstance();
		st2.printMethod();

	}

}
