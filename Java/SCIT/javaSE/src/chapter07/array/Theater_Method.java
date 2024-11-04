package chapter07.array;

import java.util.Scanner;

public class Theater_Method {
	
	// 멤버 변수
	private int[][] seats = new int[7][7];
	private final Scanner scan = new Scanner(System.in);

	
	// 멤버 메서드
	public void printMenu() {
		String menu = """
				메뉴의 번호를 선택해주세요.
				===========================
				1. 좌석 확인
				2. 좌석 예약
				0. 종료
				===========================
				번호를 선택하세요 :
				""";
		System.out.println(menu);
	}
	
	public int inputCnt() {
		System.out.println("몇 개의 좌석을 예약하시겠습니까? : ");
		int cnt = scan.nextInt();
		return cnt;
	}
	
	// 극장 좌석의 예약현황
	public void seatInfo() {
		System.out.println("- 현재 좌석 예약 현황 -");
		System.out.println("===================");
		System.out.println("   1 2 3 4 5 6 7");
		System.out.println("===================");
		for (int i = 0; i < seats.length; i++) {
			System.out.print((i+1) + "| ");
			for (int j = 0; j < 7; j++) {
				System.out.print(seats[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	// 예약할 좌석의 개수를 매개변수로 받고, 그 횟수 만큼 행과 열의 값을 입력받는다.
	public void reservationSeats(int cnt) {
		for (int i=0; i < cnt; i++) {
			while (true) {
				System.out.println("앞에서 몇번째 줄(행) : ");
				int row = scan.nextInt();
				System.out.println("몇번째 열? : ");
				int column = scan.nextInt();
				if (seats[row-1][column-1] == 0) {
					seats[row-1][column-1] = 1;
					System.out.println("해당 " + row + "행 "
							+ column + "열이 예약되었습니다.");
					break;
				} else if (seats[row-1][column-1] == 1) {
					System.out.println("해당 " + row + "행 "
					+ column + "열은 예약된 좌석입니다.");
					continue;
				}
			}
			
		}
	}
	
	
}
