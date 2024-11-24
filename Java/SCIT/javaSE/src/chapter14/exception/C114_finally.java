package chapter14.exception;

import java.util.Scanner;

public class C114_finally {
	
	public static void main(String[] args) {
		System.out.println("접속");
		
		try {
			System.out.println("전송");
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외처리");
		} finally { // 에러가 나든 안나든 무조건 수행되어지는 구문 
			System.out.println("접속 해제");
		}
		
		System.out.println("접속 해제");
		
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("입력: ");
			int num = scan.nextInt();
			System.out.println(num);			
		} catch (Exception e) {
			
		} finally {
			scan.close(); // 여기 놔두면 에러가 나든 안나든 수행 
			// Scan이 계속 실행되는 자원낭비를 막음 
		}
		
		// AutoCloseable - 리소스를 사용하는 객체들이 더이상 필요하지 않을때
		//					자동으로 자원을 해제해 줌 
		//					자동으로 할당 해제하는 close() 호출 
		// try-with-resources 구문
		try (Scanner scan2 = new Scanner(System.in)) {
			System.out.print("입력: ");
			int num = scan2.nextInt();
			System.out.println(num);	
		} catch (Exception e) {
			
		}
		
	}

}
