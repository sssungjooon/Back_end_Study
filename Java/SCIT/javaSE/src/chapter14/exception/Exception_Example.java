package chapter14.exception;

import java.util.Scanner;

class DashException extends Exception {
	public DashException(String message) {
		super(message);
	}
}

class LengthException extends Exception {
	public LengthException(String message) {
		super(message);
	}
}

public class Exception_Example {

	public static void main(String[] args) {
		// 사용자 정의 예외클래스 구현하기
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("주민등록번호를 입력하세요.");
			System.out.println("(예: 980101-1234567)");
			String ssn = scan.nextLine();
			
			if (ssn.charAt(6) != '-') {
				throw new DashException("> - 를 입력해주세요.");
			} else if (ssn.length() != 14) {
				throw new LengthException("> 14자리를 입력해주세요");
			}
		} catch (DashException e) {
			System.out.println(e.getMessage());
		} catch (LengthException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
