package chapter01.data;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
/*
 		이름, 나이, 키를 입력받아 출력하세요.
 		출력결과
 			이름 : 홍길동
 			나이 : 20
 			키 : 188.9
 			이름은 홍길동이고 나이는 20세, 키는 188.9cm입니다.
 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("나이 : ");
		int age = scan.nextInt();
		System.out.print("키 : ");
		double height = scan.nextDouble();
		System.out.println("이름은 " + name + "이고,");
		System.out.println("나이는 " + age + "세,");
		System.out.println("키는 " + height + "Cm입니다.");
		
		System.out.println("이름은 " + name + 
							"이고, 나이는 " + age + "세,"
							+ "키는 " + height + "Cm입니다.");

	}

}
