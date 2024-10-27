package chapter04.loop;

public class Loop_Example07 {

	public static void main(String[] args) {
		/*
		 
		 3번					4번
		     *				*****
		    **				 ****
		   ***				  ***
		  ****				   **
		 *****				    *
		 
		 */
		
		// 3번
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= 1; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 4번
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
