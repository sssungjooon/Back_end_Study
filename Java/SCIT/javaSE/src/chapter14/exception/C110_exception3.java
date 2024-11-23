package chapter14.exception;

public class C110_exception3 {

	public static void main(String[] args) {
		int a, b, c;
		a = 5;
		b = 2;
		int[] ar = {1, 2, 3, 4, 5};
		
		try {
			c = a / b;
			System.out.println("c: " + c);
			ar[5] = 100;
		} catch (ArithmeticException
			| // OR 연산자 
			ArrayIndexOutOfBoundsException
			e) {
				System.out.println("0으로 나누기 또는 배열범위 초과 발생");
			}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("프로그램 실행 완료");
	}

}
