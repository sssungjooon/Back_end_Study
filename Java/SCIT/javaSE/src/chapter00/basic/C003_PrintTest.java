package chapter00.basic;

public class C003_PrintTest {

	public static void main(String[] args) {
		// 출력을 도와주는 메서드 
		System.out.println("안녕"); // 개행 O
		System.out.print("안녕"); // 개행 X
		
		System.out.println("테스트");
		
		// 숫자
		System.out.println(1234); // 정수
		int num = 1234;
		System.out.println(num);
		System.out.println(3.14); // 실수
		double num2 = 3.14;
		System.out.println(num2);
		
		// 문자
		System.out.println('가'); // 문자
		char char1 = '가';
		System.out.println("가나다"); // 문자열 
		String char2 = "가나다";
		System.out.println(char2);
	}

}
