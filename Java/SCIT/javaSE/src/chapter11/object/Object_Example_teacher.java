package chapter11.object;

import java.util.Scanner;

public class Object_Example_teacher {

	public static void main(String[] args) {
/*
 		주민등록번호 입력받기
 		1. - 을 포함한 14자리를 문자열로 입력받는다.
 		2. 14자리가 아니거나 - 이 없다면 실행 종료
 		3. 입력받은 주민등록번호의 부분을 추출하여 출생연도, 출생 월, 출생 일 
 			, 성별을 출력한다.
 		4. 주민등록번호의 뒷자리의 숫자가 1, 2일 경우 1900년대 생이고
 			3, 4일 경우 2000년대 생
 			주민등록번호의 뒷자리의 숫자가 1, 3일 경우 남자이고
 			2, 4일 경우 여자 
 		
 		출력 결과 
 			주민등록번호를 입력하세요 (예 : 980101-1234567):
 			980101-1234567
 			출생 연도: 1998
 			출생 월: 01
 			출생 일: 01
 			성별: 남성
 			
 */
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요 (예 : 980101-1234567)");
		String ssn = sc.nextLine();
		
		// 주민번호 유효성 검사
		if (ssn.length() != 14 || ssn.charAt(6) != '-') {
			System.out.println("잘못된 형식의 주민등록번호입니다.");
			return;
		} 
		
		// 생년월일 추출
		String birthYear = ssn.substring(0, 2);
		String birthMonth = ssn.substring(2, 4);
		String birthDay = ssn.substring(4, 6);
		
		// 성별 코드 추출
		char genderCode = ssn.charAt(7);
		String gender = "";
		
		// 출생 연도 및 성별 결정
		switch (genderCode) {
		case '1': case '2':
			birthYear = "19" + birthYear;
			gender = (genderCode == '1') ? "남성" : "여성";
			break;
		case '3' : case '4':
			birthYear = "20" + birthYear;
			gender = (genderCode == '3') ? "남성" : "여성";
			break;
		default:
			System.out.println("잘못된 주민등록번호입니다.");
			return;
 		}
		
		// 출력
		System.out.println("출생 연도: " + birthYear);
		System.out.println("출생 월: " + birthMonth);
		System.out.println("출생 일: " + birthDay);
		System.out.println("성별: " + gender);
	}

}
