package chapter01.data;

public class C006_DataType {

	public static void main(String[] args) {
		/*
		 [ 데이터 타입 ]
		 1. 기본형 데이터타입
		 	- 정수형
		 		byte(1), short(2), int(4), long(8)
		 		char(2)=> 문자형도 가능 
		 	- 실수형
		 		float(4), double(8)
		 	- 논리형
		 		boolean(1)
		 2. 참조형 데이터타입
		 	- 기본형 데이터 타입이 아닌 모든 "객체"
		 		class, enum, array, ... 
		 */
		
		// 기본형 데이터타입
		byte a = 127; // 128이 되면 다른 데이터타입을 써야한다. 
		short b = 12345;
		int c = 1234567890;
		long d = 12345678900L; // 대문자 혹은 소문자 L
		char e = 'A';
		float f = 3.14F; // 대문자 혹은 소문자 F 
		double g = 3.14;
		boolean h = true; // True, False 외의 값은 X
		String i = "안녕";
		String j = null;

		// 동적으로 데이터타입이 변경 
		var v1 = 'B';
		var v2 = 123; 
		
		// 문자형 타입의 정수화
		char alpha = 'A';
		System.out.println(alpha);
		
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1); // 강제 형변환 
		
		// 정수형 타입의 문자화 
		char ch2 = 66;
		System.out.println(ch2);
		
		char ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
	}

}
