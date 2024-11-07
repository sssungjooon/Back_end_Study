package chapter08.inheritance;

class Human2 {
	int age;
	String name;
	
	Human2(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void intro() {
		System.out.println("안녕, " + age + "살 " 
				+ name + "이라고 해.");
	}
}

class Student2 extends Human2 {
	int stnum;
	String major;
	
	Student2(int age, String name, int stnum, String major) {
		super(age, name);
		this.stnum = stnum;
		this.major = major;
	}
	
	// 메서드 오버라이딩
	@Override
	public void intro() {
		System.out.println(major + "학과 " + stnum + "학번 "
				+ name + "입니다.");
	}
	
	public void study() {
		System.out.println("복습!");
	}
	
}

public class C070_overriding1 {
/*
메서드 오버라이딩 조건
1. 상속관계에서만 가능
2. 부모가 가지고 있는 메서드의 파라미터 타입, 개수가 동일해야 하며,
	메서드의 이름도 동일해야하며,
	리턴타입도 동일해야한다.
3. 부모 <= 자식 범위의 접근제어자를 사용해야 한다
 */

	public static void main(String[] args) {
		Human2 kim = new Human2(29, "김상형");
		kim.intro();
		
		Student2 lee = new Student2 (42, "이승우", 12345, "경영");
		lee.intro();
		lee.study();
	}

}
