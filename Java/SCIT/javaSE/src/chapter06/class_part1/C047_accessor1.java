package chapter06.class_part1;

class UserTest {
	public String id = "홍길동";
	private String password = "1111";
	
	public String passwordCheck() {
		return this.password;
	}
}

/*
 	접근지정자 (= 접근제어자)
 	클래스, 메서드, 변수 등에 접근 허용 범위를 지정하여 외부로부터의 접근을 제어
 	- public
 		클래스: 같은 클래스, 같은 패키지, 다른 패키지에서 모두 접근 가능
 		메서드/변수: 같은 클래스, 같은 패키지, 다른 패키지의 모든 클래스에서 접근 가능
 	- protected
 		클래스: 클래스에는 사용할 수 없음.
 		메서드/변수: 같은 클래스, 같은 패키지, 상속관계 (다른 패키지의 하위 클래스에서
 			접근 가능)의 클래스에서만 접근 가능
 	- default
 		클래스: (아무 접근 지정자를 명시하지 않을 경우)
 		메서드/변수: 같은 클래스와 같은 패키지에서만 접근 가능
 	- private
 		클래스: 클래스에서는 사용할 수 없음
 		메서드/변수: 같은 클래스에서만 접근 가능 
 */

public class C047_accessor1 {

	public static void main(String[] args) {
		UserTest user = new UserTest();
		System.out.println("id: " + user.id);
		System.out.println("pw: " + user.passwordCheck());
//		System.out.println("pw: " + user.password);
		user.id = "홍길동";
//		user.password = "1234";
	}

}
