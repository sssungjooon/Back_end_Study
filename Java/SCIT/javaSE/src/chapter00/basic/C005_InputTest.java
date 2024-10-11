package chapter00.basic;

import java.util.Scanner;

public class C005_InputTest {

	public static void main(String[] args) {
		// 입력
		// 자동 import : ctrl + shift + o 
		Scanner scan = new Scanner(System.in);
		// int num = 100;
		
		System.out.print("byte: ");
		byte a = scan.nextByte();
		System.out.println(a);
		
		System.out.print("short: ");
		short b = scan.nextShort();
		System.out.println(b);
		
		System.out.print("int: ");
		int c = scan.nextInt();
		System.out.println(c);
		
		System.out.print("long: ");
		long d = scan.nextLong();
		System.out.println(d);
		
		System.out.print("String: ");
		String e = scan.next();
		System.out.println(e);
	}

}
