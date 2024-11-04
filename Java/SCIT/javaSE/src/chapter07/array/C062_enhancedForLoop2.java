package chapter07.array;

public class C062_enhancedForLoop2 {

	public static void main(String[] args) {
		int[][] score = {
				{ 77, 56, 70, 82 },
				{ 99, 96, 89, 88 },
				{ 81, 78, 24, 22 }
		};
		
		for (int[] student : score) {
			for (int subject : student) {
				System.out.print(subject + " ");
			}
			System.out.println();
		}

	}

}
