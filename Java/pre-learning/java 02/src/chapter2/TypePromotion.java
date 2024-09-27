package chapter2;

public class TypePromotion {

	public static void main(String[] args) {
		// 10 / 3 -> 3 
		// (두 피연산자의 타입이 정수여서 결과도 정수로 나온다)
		// double d = 3 
		// (정수를 실수에 대입해서 실수로 프로모션이 발생 -> 3.0)
		double d = 10 / 3;
		System.out.println(d);
		
		// 10/3.0 -> 10 (int) / 3.0 (double), 서로 다른 타입으로 연산을 수행하면 그 중 큰 데이터
		// 10/3.0 -> 10.0 / 3.0 으로 변환돼서 연산 수행 
		double e = 10 / 3.0;
		System.out.println(e);

	}

}
