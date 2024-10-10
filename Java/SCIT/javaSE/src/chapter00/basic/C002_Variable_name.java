package chapter00.basic;

public class C002_Variable_name {

	public static void main(String[] args) {
		/*
			[변수의 명명 규칙]
			1. 변수의 이름은 영문자(대문자, 소문자)나 숫자를 사용
			2. 특수문자 $, _만 사용 가능
			3. 변수의 이름은 숫자로 시작할 수 없음
			4. 자바에서 이미 사용중인 예약어는 사용할 수 없음
			
			[암묵적 규칙]
			1. 클래스의 이름은 항상 대문자로 시작
			2. 변수의 이름은 알파벳으로 사용하되 _ 혹은 대문자로 단어를 구별
			3. 변수에 할당하는 값과 연상되는 의미의 단어를 사용 
			
		 */
		int num;
		// int 1num; // 숫자로 시작 X
		int num2;
		int kor_score; // snake case 
		int totalAvg; // camel case
		// int if; // 예약어 X 
	}

}
