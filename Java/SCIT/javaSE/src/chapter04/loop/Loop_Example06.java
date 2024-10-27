package chapter04.loop;

public class Loop_Example06 {

	public static void main(String[] args) {
		/*
		
		 1번			2번
		 *			*****
		 **			****
		 ***		***
		 ****		**
		 *****		*

		 */

		// 1번 
		for (int i = 1; i <= 5; i++) {
			for (int j=1; j <= 5; j++) {
				if (i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 2번
		for (int i = 0; i <= 4; i++) {
			for (int j = 4; j >= 0; j--) {
				if (i-1 < j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		// 1번 - 두번째풀이 
		for (int i=1; i<=5; i++) {
			System.out.println("*".repeat(i));
		}
		System.out.println();
		
		
		// 2번
		for (int i = 0; i <= 4; i++) {
			for (int j = 5; j >= 1; j--) {
				if (i < j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 1번 역으로 해보기
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i > j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
	}

}
