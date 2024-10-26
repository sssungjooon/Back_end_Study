package chapter04.loop;

public class Loop_Example01 {

	public static void main(String[] args) {
		/*
		 	출력 결과:
		 		0 1 2 3 4 5 6 7 8 9
		 		1 2 3 4 5 6 7 8 9 10
		 		1 3 5 7 9
		 		0 2 4 6 8 10
		 		10 20 30 40 50 60 70 80 90 100
		 		5 4 3 2 1
		 		10000 1000 100 10 1
		 */
		
		// 0 1 2 3 4 5 6 7 8 9
		for (int i=0; i <= 9; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 1 2 3 4 5 6 7 8 9 10
		for (int i=1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 1 3 5 7 9 
		for (int i=1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		// 0 2 4 6 8 10 
		for (int i=0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		// 10 20 30 40 50 60 70 80 90 100
		for (int i=10; i <= 100; i++) {
			if (i % 10 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		// 5 4 3 2 1
		for (int i=5; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 10000 1000 100 10 1
		for (int i=4; i >= 0; i--) {
			System.out.print((int)Math.pow(10, i) + " ");
		}
		
		/*  선생님 풀이 
		 	for (int i = 10000; i > 0; i /= 10) {
		 		System.out.print(i + " ");
		 	}
		 */
		
	}

}
