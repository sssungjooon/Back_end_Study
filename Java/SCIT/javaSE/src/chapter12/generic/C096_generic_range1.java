package chapter12.generic;

/*
	타입 한정 키워드 extends
	<T extends [제한타입]>
 */

class Calculator<T extends Number> {
	void add(T a,T b) { }
	void min(T a,T b) { }
	void mul(T a,T b) { }
	void div(T a,T b) { }
}

public class C096_generic_range1 {

	public static void main(String[] args) {
		Calculator<Number> cal1 = new Calculator<>();
		Calculator<Integer> cal2 = new Calculator<>();
		Calculator<Double> cal3 = new Calculator<>();
		
		// Generic의 범위 결정 가능 
		// 상한선이 Number 까지라 컴파일 에러
//		Calculator<String> cal4 = new Calculator<>(); //err
//		Calculator<Object> cal5 = new Calculator<>(); //err
	}

}
