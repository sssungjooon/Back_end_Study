package chapter04.loop;

public class Loop_Example04 {

	public static void main(String[] args) {
		/*
		 	수열 출력
		 	1번			2번 			3번
		 	0 0 0 0 0 	0 0 0 0 0	0 1 2 3 4 
		 	0 0 0 0 0 	1 1 1 1 1	0 1 2 3 4
		 	0 0 0 0 0 	2 2 2 2 2	0 1 2 3 4
		 	0 0 0 0 0 	3 3 3 3 3 	0 1 2 3 4
		 	0 0 0 0 0 	4 4 4 4 4	0 1 2 3 4
		 */
		
		// 1번
		for (int i=0; i < 5; i++) {
			for (int j=0; j < 5; j++) {
				System.out.print(0 + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 2번 
		for (int i=0; i < 5; i++) {
			for (int j=0; j < 5; j++) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 3번
		for (int i=0; i < 5; i++) {
			for (int j=0; j < 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		
	}

}
