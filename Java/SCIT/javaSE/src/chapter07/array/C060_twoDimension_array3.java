package chapter07.array;

public class C060_twoDimension_array3 {

	public static void main(String[] args) {
		int[][] score = { // 학생의 점수
				{ 77,56,70,82, 95, 96, 98, 82 },
				{ 99,96 },
				{ 81,69,62,80, 77}
		};
		for (int student = 0; student < score.length; student++) {
			System.out.println((student+1) + "번 학생의 성적: ");
			for (int subject = 0; subject < score[student].length; subject++) {
				System.out.print(score[student][subject] + " ");
			}
			System.out.println();
		}

	}

}
