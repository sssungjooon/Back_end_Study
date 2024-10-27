package chapter04.loop;

public class Loop_Example08 {

	public static void main(String[] args) {
		/*
		 
	  		 3번					4번
		     *				*********
		    ***				 *******
		   *****			  *****
		  *******			   ***
		 *********				*
		 
		 */
		
		// 3번

		for (int i= 1; i<= 5; i++) {
			System.out.println(" ".repeat(5-i)+"*".repeat(2*i-1));
		}
		
		System.out.println();
		
		// 4번
		for (int i=5; i >= 1; i--) {
			System.out.println(" ".repeat(5-i)+"*".repeat(2*i-1));
		}
		
		System.out.println();
		
		// 3번 - 2번째풀이
//		for (int i=5; i >= 1; i--) {
//			for (int j=1; j <= 9; j++) {
//				if (Math.abs(i-j) < 1) {
//					System.out.print("*");
//				} else if (Math.abs(j-i) < 1){
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}

		// 3번째 선생님 풀이 
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 5-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2*i -1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 4번째 선생님 풀이
		for (int i = 5; i >= 1; i--) {
			for (int j = 5-i; j>0; j--) {
				System.out.print(" ");
			}
			for (int k= 2*i -1; k >0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 4번째 선생님 두번째 풀이
//		for (int i = 5; i >= 1; i--) {
//			for (int j = 5-i; j<0; j++) {
//				if (j <= 5-i) {
//					System.out.print(" ");
//				} else {
//					System.out.println("*");
//				}
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
		
	}

}
