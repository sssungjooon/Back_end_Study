package chapter04.loop;

public class C028_for3 {

	public static void main(String[] args) {
		// 전역변수
		int globalVariable = 10;
		
		if (true) {
			System.out.println("IF문 내 전역변수 출력: "
					+ globalVariable);
			// 지역변수
			int localVariable = 100;
			System.out.println("IF문 내 지역변수 출력: "
					+ localVariable);
		}
		System.out.println("IF문 내 전역변수 출력: "
				+ globalVariable);
//		System.out.println("IF문 내 지역변수 출력: "
//				+ localVariable); // err

	}

}
