package chapter3;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		System.out.print("분류코드를 입력하세요:");
		Scanner input = new Scanner(System.in);
		int code = input.nextInt();
		
		switch (code) {
		case 1:
			System.out.println("Java 입니다.");
			break; 
		// 브레이크가 없으면 여기서 끝내는 것이 아닌 브레이크를 만날 때까지 계속 실행한다
		case 2:
			System.out.println("Python 입니다.");
			break;
		case 3:
			System.out.println("C++ 입니다.");
			break;
		default:
			System.out.println("기타입니다.");
			break;
		}
	}

}
