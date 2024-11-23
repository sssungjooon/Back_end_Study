package chapter14.exception;

public class C109_exception2 {

	public static void main(String[] args) {
		// 다중 예외 처리
		int a, b, c;
		a = 5;
		b = 2;
		int[] ar = {1, 2, 3, 4, 5};
		
		/*
		 	Exception의 상하관계
		 	
		 	Throwable // 가장 최상위
		 	Exception					
		 	(런타임 시점)					(컴파일 시점)
		 	RuntimeException			IOException
		 	IndexOutofBoundsException	FileNotFoundException
		 */
		
		try {
			c = a / b;
			System.out.println("c = " + c);
			ar[5] = 100;
		}
//		catch (ArithmeticException e) {
//			System.out.println("0으로 나누기 예외 발생");
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("첨자가 배열 범위를 넘어섰습니다.");
//		}
		catch (Exception e) {
			// Exception e = new ArithmeticException();
			// 프로그램의 현재 실행위치와 오류가 발생한 위치를 알려줌
			// 예외의 발생 원인과 위치를 파악하는데 유용
			e.printStackTrace();
			// 예외에 대한 상세 메시지를 반환 
			System.out.println(e.getMessage());
		}
		
		System.out.println("프로그램 실행 완료");

	}

}
