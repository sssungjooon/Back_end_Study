package chapter01.data;

public class C007_Constant {

	public static void main(String[] args) {
		// 상수
		// final 지정자가 붙으며 초기식을 반드시 주어야 함.
		// 값 변경 X
		final double RATE = 3.28;
		System.out.println("이자율: " + RATE);
		
//		RATE = 100; // 상수는 재할당 불가능 

	}

}
