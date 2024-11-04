package chapter07.array;

import java.util.Scanner;

public class Theater {

	public static void main(String[] args) {
/*
 * 극장 좌석 예약 프로그램 만들기
 * 		1. Theater, Theater_Method 두개의 클래스를 생성하여 기능을 분리한다.
 * 		2. Theater클래스에서는 main()메서드를 포함하며 출력문구를 사용하지 않는다. 
 * 		3. Theater_Method의 멤버변수 혹은 멤버메서드를 호출하여 출력문구 및 로직을 처리한다.
 * 
 * Theater
 *    main() : 메뉴를 종료를 선택하기 전까지 반복하여 보여주고 선택된 번호에 따라 기능을 수행한다.
 * 
 * Theater_Method
 * 	   멤버 변수
 * 		외부에서의 데이터의 접근을 막기 위해 다음과 같이 선언한다.
 * 		private int[][] seats = new int[7][7];
 * 
 * 	   멤버 메서드
 * 		1. printMenu() : 극장 좌석의 예약 현황을 보여준다.
 * 		2. inputCnt() : 예약할 좌석의 개수를 입력받아 반환한다.
 * 		3. seatInfo() : 2차원배열을 이용하여 극장 좌석의 예약현황을 보여준다.
 * 				(예약 X : 0, 예약 O : 1)
 * 		4. reservationSeats(int cnt) : 예약할 좌석의 개수를 매개변수(parameter)로 받고
 * 				그 횟수만큼 행과 열의 값을 입력받는다.
 * 				a. 예약이 되어 있지 않을 경우(해당 행과 열의 값이 0일때), 
 * 				      해당 행과 열의 값을 1로 변경하고, "예약되었습니다."라는 문구를 출력한다.
 * 				b. 예약이 되어 있는 경우(해당 행과 열의 값이 0일때),
 * 				   "x행x열은 예약된 좌석입니다."라는 문구를 출력하고, 다시 행과 열을 입력 받는다.
 * */
		Theater_Method tm = new Theater_Method();
		Scanner sc = new Scanner(System.in);
		int num = 0, cnt = 0;
		
		while (true) {
			tm.printMenu();
			num = sc.nextInt();
			switch (num) {
				case 1:
					tm.seatInfo();
					break;
				case 2:
					cnt = tm.inputCnt();
					tm.reservationSeats(cnt);
					break;
				case 0:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					break;
				default:
					System.out.println("번호를 잘못입력했습니다.");
			}
		}

	}

}
