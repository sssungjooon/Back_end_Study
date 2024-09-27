package chapter2;

// 무형의 객체인 계좌를 만들기 위한 클래스
public class Account {
	// 계좌번호 (문자열 형태의 자료)
	String accountNo;
	// 계좌 소유주 이름 (문자열 형태의 자료)
	String owner;
	// 잔고 (정수 형태의 자료)
	int balance; 
	
	// 생성자 (객체 생성 시 계좌 번호, 소유주 이름, 잔고를 초기화 하는 용도)
	Account(String accountNo, String owner, int balance){
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}
	
	// 입금 (type-A)
	void deposit(int amount) {
		balance = balance + amount;
	}
	
	// 입금 (type-B) - 반환해야할 타입 
	/*
	 * int deposit(int amount) { balance = balance + amount; return balance; }
	 */
	
	// 출금
	boolean withdraw(int amount){
		boolean result = false; // 이체 결과를 저장하는 변수 : 성공 -> true, 실패 -> false
		if(balance >= amount) {
			balance = balance - amount;
			result = true;
		}// end if
		return result;
	}// end method
}
