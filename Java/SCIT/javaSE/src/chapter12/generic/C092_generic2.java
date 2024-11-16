package chapter12.generic;

import java.util.ArrayList;

public class C092_generic2 {
/*
	제네릭
	 - 데이터 타입의 다형성
	 - 참조형 데이터 타입만 가능
	
	장점
	 - 클래스 외부에서 타입을 지정해주기 때문에 
	   따로 타입을 체크하고 변환할 필요가 없다.
	 - 컴파일 시점에서 의도치 않은 타입의 사용을 막을 수 있다.(타입 안정성)
	 - 코드의 재사용성이 높아진다.
 */
	public static void main(String[] args) {
		ArrayList arNum = new ArrayList();
		arNum.add(1);
		arNum.add("문자열");
		
		int value = (int) arNum.get(0); //object라 캐스팅 필요
		System.out.println(value);
//		int err = (int) arNum.get(1); //캐스팅 에러
//		System.out.println(err);
		
		ArrayList<Integer> arNum2 = new ArrayList<Integer>();
		arNum2.add(1);
//		arNum2.add("문자열");	//컴파일 시점에 타입 체크 > err
	}
}