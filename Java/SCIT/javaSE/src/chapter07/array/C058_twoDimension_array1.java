package chapter07.array;

public class C058_twoDimension_array1 {

	public static void main(String[] args) {
		int[][] score = {
				{ 77,56,70,82 },
				{ 99,96,89,88 },
				{ 81,69,62,80}
		};
		
		for (int student = 0; student < score.length; student++ ) {
			System.out.println((student+1) + "번 학생의 성적: ");
			for (int subject = 0; subject < 4; subject++) {
				System.out.println(score[student][subject] + " ");
			}
			System.out.println();
		}

	}

}
