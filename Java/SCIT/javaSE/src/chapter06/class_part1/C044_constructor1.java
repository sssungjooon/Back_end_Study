package chapter06.class_part1;

class User {
	String name;
	int age; 
	
	public void userInfo() {
		System.out.println("이름: " + name
				+ ", 나이: " + age);
	}
	
	/*
	 	생성자 (constructor)
	 	- 클래스를 통해 생성되는 인스턴스의 초기화를 도와주는 메서드의 일종
	 	- 클래스 내에 선언되며, 클래스의 이름과 같으며, 리턴값이 없다
	 	- 생성자도 오버로딩이 가능하므로 하나의 클래스에 여러 개의 생성자가 존재 가능 
	 */
	
	// 기본 생성자 
	User() {
		System.out.println("기본 생성자 호출");
	}
	
	// 명시적 생성자
	User(String aName) {
		name = aName;
	}
	
	// 생성자 오버로딩
	User(String aName, int aAge) {
		name = aName;
		age = aAge;
	}
}

public class C044_constructor1 {

	public static void main(String[] args) {
		User user1 = new User();
		user1.userInfo();
		
		User user2 = new User("홍길동");
		user2.userInfo();
		
		User user3 = new User("홍길동", 30);
		user3.userInfo();
				
	}

}
