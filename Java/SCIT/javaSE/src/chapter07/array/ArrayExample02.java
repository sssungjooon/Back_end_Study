package chapter07.array;

import java.util.Scanner;

public class ArrayExample02 {

	public static void main(String[] args) {
/*
		문제
			원소 개수를 입력받아 배열을 생성하고 각 원소의 값을입력받아 저장한 후,
			전체 원소의 합계를 구하여 출력한다.
		조건
			배열 원소 개수는 2 이상의 정수로 입력받는다.
			2 미만의 값이 입력되면 오류 메시지를 출력하고 다시 입력받는다.
		출력결과
			배열의 크기 : 5				배열의 크기 : 1
			arr[0] = 1				2 이상의 값을 입력하세요.
			arr[1] = 2				배열의 크기 : (입력 대기)
			arr[2] = 3
			arr[3] = 4
			arr[4] = 5
			1 + 2 + 3 + 4 + 5 = 15
 */
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("배열의 크기 : ");
			int size = sc.nextInt();
			if (size < 2) {
				System.out.println("2 이상의 값을 입력하세요.");
				continue;
			} else {
				int[] arr = new int[size];
				for (int i=0; i < arr.length; i++) {
					System.out.print("arr["+i+"] = ");
					int k = sc.nextInt();
					arr[i] = k;
				}
				// 합 구하기
				int sum = 0;
				for (int i=0; i < arr.length; i++) {
					sum += arr[i];
				}
				// 출력하기
				for (int i=0; i < arr.length-1; i++) {
					System.out.print(arr[i] + " + ");
				}
				System.out.print(arr[arr.length-1]+ " = " + sum);
				break;
			}
		}
		
	}

}
