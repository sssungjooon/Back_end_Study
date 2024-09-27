package chapter2;

public class BankTest {

	public static void main(String[] args) {
		// new는 객체를 생성하는 키워드, 오른쪽에는 생성자를 대체한다.
		// 클래스는 동시에 데이터 타입이다. 참조 자료형 
		// Account 클래스 객체 a1, a2
		Account a1 = new Account("11-11","홍길동",100);
		Account a2 = new Account("11-12","사오정",500);
		// 객체를 이용해서 변수와 메서드를 호출하는 방법
		// => 객체이름.변수명, 객체이름.메서드명
		System.out.println("홍길동 고객 11-11에 100원 입금");
		a1.deposit(100);
		System.out.println(a1.accountNo+":"+a1.balance);
		System.out.println("홍길동 고객 11-11에 300원 출금");
		boolean result = a1.withdraw(300);
		if(result) 
			System.out.println("출금 성공!");
		else
			System.out.println("잔고가 부족합니다.");
	}

}
