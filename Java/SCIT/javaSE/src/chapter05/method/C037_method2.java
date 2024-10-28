package chapter05.method;

public class C037_method2 {
	/*
 	메서드 생성부분 (정의 부분)
 	접근지정자 (키워드) 리턴타입(반환할 데이터 타입) 메서드 이름 (데이터 타입 변수1, ..) {
 		메서드가 호출 되었을 때 실행할 명령어
 		return 리턴 타입에 일치하는 데이터 ; 
	}
	 */

	public static void main(String[] args) {
		method1(); // 메서드 호출 
		String result = method2();
		System.out.println(result);
		method3(10);
		method4(1, 10);
		System.out.println(method4(1,10));
	}
	
	// 1. 데이터를 받아오지도 데이터를 반환하지도 않는 메서드
	// 파라미터 X, 반환값 X
	// void = 아무것도 없다 :
	// 반환할 데이터가 없으면 없다의 의미로 void를 명시해줘야 한다. 
	public static void method1 () {
		System.out.println("명령어");
		System.out.println("단순 명령어 실행, 아무 값도 받지 않았고,"
				+ "println만 실행했을 뿐 아무 값도 반환하지 않았다.");
	}
	
	// 2. 데이터를 받아오지는 않지만, 데이터를 반환하는 메서드
	// 파라미터 X, 반환값 O
	public static String method2() {
		System.out.println("2번째 메서드 출력");
		String result = "반환값";
		return result;
	}
	
	// 3. 데이터를 받아오지만 데이터를 반환하지는 않는 메서드
	// 파라미터 O, 반환값 X
	public static void method3(int a) {
		System.out.println("받아온 파라미터: " + a
				+ "를 출력만 할뿐 반환하지는 않는다.");
	}
	
	// 4. 데이터를 받아오기도 데이터를 반환하기도 하는 메서드
	// 파라미터 O, 반환값 O
	public static int method4(int a, int b) {
		
		return a+b;
	}
	
}
