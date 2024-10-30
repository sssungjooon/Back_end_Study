package chapter06.class_part1;

class Product {
	static int count = 0; //생성된 인스턴스의 수를 저장하기 위한 변수
	int serialNo;		// 인스턴스 고유 번호
	
	static String productName; // 클래스 초기화, 정적 변수
	int num = 1;	// 명시적 초기화, 인스턴스 변수
	
	/*
	 	static : 프로그램이 실행되어 메모리에 올라갔을 때 딱 한번 메모리공간 할당,
	 	 		모든 인스턴스가 공유
	 	
	 	클래스 변수 : 클래스가 처음 로딩될때 단 한번 초기화
	 	인스턴스 변수 : 인스턴스가 생성될 때마다 각 인스턴스별로 초기화
	 	클래스변수의 초기화 순서 : 기본값 > 명시적 초기화 > 클래스 초기화 블럭
	 	인스턴스변수의 초기화 순서 : 기본값 > 명시적 초기화 > 인스턴스 초기화 블럭 > 생성
	 	
	 	- 기본값 : 예를 들어, 숫자형 변수는 0,
	 		boolean은  false, 객체 참조변수는 null
	 */
	
	// 클래스 초기화 블럭
	static { // 클래스 or 정적 
		productName = "scit_46";
		System.out.println("static: " + productName);
		System.out.println("클래스 초기화 블럭 실행");
	}
	
	// 인스턴스 초기화 블럭
	{
		count++;
		serialNo = count;
		System.out.println("인스턴스 초기화 블럭 실행");
	}
	
	// 기본 생성자
	public Product() {
		num++;
		System.out.println("기본 생성자 실행");
	}
	
}

public class C046_constructor3 {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();

		System.out.println("p1의 제품번호는 " + p1.serialNo);
		System.out.println("p2의 제품번호는 " + p2.serialNo);
		System.out.println("p3의 제품번호는 " + p3.serialNo);
		System.out.println("생산된 제품 수는 모두 " + Product.count);
		
		p1.num = 10;
		System.out.println(p1.num);
		System.out.println(p1.count);
		System.out.println(Product.count);
	}

}
