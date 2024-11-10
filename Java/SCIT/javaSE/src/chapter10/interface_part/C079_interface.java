package chapter10.interface_part;

/*
	인터페이스 목적/이유
	 - 자바의 다형성을 극대화하여 개발 코드 수정을 줄이고 프로그램 유지보수성 향상
	 - 공통점끼리만 하나로 묶어야 할 경우
	   상속관계가 아닌 것들도 다형적 변수에 의해 같은 타입으로 만들 수 있음
	 - 같은 타입으로 묶음으로써 매개변수의 다형성을 가질 수 있음
	 (Java8 부터 default, static 메서드 추가) 
 */

interface Calc {
	// 인터페이스에서 선언한 변수는 static final이 생략된 상수
	double PI = 3.14;
	int ERROR = -999999999;
	
	// 인터페이스에서 선언한 메서드는 자동으로 추상메서드로 반환
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// default 메서드
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
	}
	
	// static 메서드
	static int total(int[] arr) {
		int total = 0;
		for (int i : arr) {
			total += i;
		}
		return total; 
	}
	
}

abstract class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
	
}

class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if (num2 != 0) 
			return num1 / num2;
		else
			return Calc.ERROR;
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현했습니다.");
	}
	
	@Override
	public void description() {
		super.description();
		System.out.println("Override - 정수 계산기를 구현합니다.");
	}
	
}

public class C079_interface {

	public static void main(String[] args) {
		System.out.println(Calc.PI);
		System.out.println(Calc.ERROR);
		int arr[] = {1,2,3,4,5};
		int sum = Calc.total(arr);
		System.out.println(sum);
		
		System.out.println("=== 인스턴스 생성 ===");
		int num1 = 10, num2 = 5;
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();
		calc.description();
		
		
		Calc			a = new CompleteCalc();
		Calculator		b = new CompleteCalc();
		CompleteCalc	c = new CompleteCalc();
		
	}

}
