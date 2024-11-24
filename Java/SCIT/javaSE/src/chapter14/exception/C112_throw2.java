package chapter14.exception;

public class C112_throw2 {
	/*
	 	Unchecked Exception : 컴파일러가 예외처리를 강제하지 않는 예외
	 	RuntimeException <-- NullPointerException
	 	이러한 예외는 컴파일 시점이 아니라 프로그램 실행 중에 발생되며,
	 	throws 키워드를 사용하지 않아도 컴파일 에러가 발생하지 않음 
	 */
	public static void main(String[] args) {
		String name = null;
		try {
			System.out.println(1);
			printScore(name); // 예외 발생 
			System.out.println(2);
		} catch (NullPointerException e){
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 실행 완료");
	}
	
	static void printScore(String name) {
		if (name == null) {
			// 예외 강제 발생 예약어 throw
			throw new NullPointerException("이름이 무효합니다.");
		}
		System.out.println(name.length());
	}

}
