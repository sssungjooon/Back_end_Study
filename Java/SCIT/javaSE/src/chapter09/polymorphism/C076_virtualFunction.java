package chapter09.polymorphism;

class A {
	int num = 10;
	void method() {
		System.out.println("메서드 실행 A");
	}
}

class B extends A {
	int num = 100;
	@Override
	void method() {
		System.out.println("메서드 실행 B");
	}
}

public class C076_virtualFunction {

	public static void main(String[] args) {
		// 다형적 변수
		// 변수는 참조 타입을 따라가고, 메서드는 생성 타입을 따라간다. 
		A aa = new A();
		A ab = new B();
		B bb = new B();
		
		// 정적 바인딩
		// 멤버변수는 컴파일 시점에 참조 타입을 기준으로 결정 
		// 컴파일 시점에 참조 타입이 결정되면, 안전하게 변수의 사용 가능 범위를 
		// 제한하고 오류를 사전에 방지할 수 있다. 
		System.out.println(aa.num);
		System.out.println(ab.num);
		System.out.println(bb.num);
		
		
		// 동적 바인딩
		// 프로그램 실행 중에 메서드 호출을 결정하는 런타임 바인딩 방식
		// 다형성을 구현하기 위해 동적 바인딩을 사용하며,
		// 상속 관계에서 메서드를 오버라이딩할 때 주로 동작 
		aa.method();
		ab.method();
		bb.method();

	}

}
