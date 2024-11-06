package chapter07.array;

import java.util.Scanner;

public class Array_Example01 {

	public static void main(String[] args) {
/*
		Original : 10 20 30 40 50 60 70 80 90 100
		변경하고 싶은 위치1을 입력하세요
		1
		변경하고 싶은 위치2를 입력하세요
		10
		New : 100 20 30 40 50 60 70 80 90 10
 
 */
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		System.out.println("Original: ");
		for (int i=0; i < numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		System.out.println();
		System.out.println("변경하고 싶은 위치1을 입력하세요");
		int num1 = sc.nextInt();
		System.out.println("변경하고 싶은 위치2를 입력하세요");
		int num2 = sc.nextInt();
		
		int temp = numbers[num2-1];
		numbers[num2-1] = numbers[num1-1];
		numbers[num1-1] = temp;
		
		System.out.println("New: ");
		for (int i=0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
 
	}

}
