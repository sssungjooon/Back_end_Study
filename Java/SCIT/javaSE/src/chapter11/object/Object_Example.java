package chapter11.object;

import java.util.Scanner;

public class Object_Example {

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
		String num = sc.next();
		if (num.length() == 14 && num.contains("-")) {
			String[] numb = num.split("-");
			String a = numb[0];
			String b = numb[1];
			System.out.println("출생 연도: 19" + a.substring(0,2));
			System.out.println("출생 월: " + a.substring(2,4));
			System.out.println("출생 일: " + a.substring(4,6));
			if (b.substring(0, 1) == "1" || b.substring(0, 1) == "3") {
				System.out.println("성별: 남성");
			} else {
				System.out.println("성별: 여성");
				System.out.println(b.substring(0,1));
			}
		} else {
			System.exit(0);
		}
	}

}
