package chapter14.exception;

public class C113_throw3 {

	public static void main(String[] args)
			throws Exception {
		String name = null;
		try {
			printScore(name);
		} catch (Exception e) {
			System.out.println("에러남");
		}
		System.out.println("프로그램 실행 완료");
	}
	
	static void printScore(String name) 
			throws Exception { // 예외처리를 미뤄버리는 키워드
		if (name == null) {
			throw new Exception("이름이 무효합니다.");
		}
		System.out.println(name.length());
	}

}
