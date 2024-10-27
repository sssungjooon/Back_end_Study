package chapter04.loop;

public class Loop_Example05 {

	public static void main(String[] args) {
		/*
			1번			2번 			
		 	1 0 0 0 0 	1 2 3 4 5	
		 	0 2 0 0 0 	2 3 4 5 6	
		 	0 0 3 0 0 	3 4 5 6 7	
		 	0 0 0 4 0 	4 5 6 7 8 	
		 	0 0 0 0 5 	5 6 7 8 9
		 */
		// 1번
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == j) {
					System.out.print(i + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		// 2번
		for (int i=1; i <= 5; i++) {
			for (int j=0; j <=4; j++) {
				System.out.print(i+j + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 선생님 풀이
		for (int i=1; i <= 5; i++) {
			for (int j=i; j < i + 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
