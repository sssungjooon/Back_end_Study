//package chapter07.array;
//
//import java.util.Scanner;
//
//public class Array_Example04_n2 {
//
//	public static void main(String[] args) {
//		/*
//		로또 생성
//		보너스 번호를 제외한 6개의 난수를 생성하는 코드 작성하기
//			1. 입력받은 개수 만큼의 게임 생성
//			2. 1게임마다 생성되는 6개의 숫자는 1 ~ 45 범위의 랜덤한 정수
//			3. 중복되는 숫자 X
//			4. 작은 수부터 출력되도록 정렬
//		
//		출력 결과
//			받을 로또 게임의 개수를 입력해주세요: 5
//			============================
//			 *[1]번 : 5 14 25 27 42 44
//			 *[2]번 : 9 15 16 17 24 27
//			 *[3]번 : 5 14 25 27 42 44
//			 *[4]번 : 5 14 25 27 42 44
//			 *[5]번 : 5 14 25 27 42 44
//	 */
//			
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.print("받을 로또 게임의 개수를 입력해주세요: ");
//			int game = sc.nextInt();
//			System.out.println("=======================");
//			for (int i=1; i <= game; i++) {
//				System.out.print("*[" + i + "]번 : ");
//				for (int j=0; j <= 6; j++) {
//					for (int k=0; k <= j-1; k++) {
//						int num = (int) (Math.random()*45);	
//						while () {
//							
//						}
//						System.out.print(num + " ");
//					}
//				}
//				System.out.println();
//			}
//			
//
//		}
//
//}
