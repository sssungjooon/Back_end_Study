package chapter03.condition;

import java.util.Scanner;

public class Switch_Example01 {

	public static void main(String[] args) {
		/*
		 	출생연도를 입력받아 띠를 출력한다.
		 	띠는 12개이며, 연도를 12로 나누었을때의 나머지 값에 따라
		 	아래와 같이 구분된다.
		 		원숭이		0	호랑이		6
		 		닭		1	토끼		7
		 		개		2   용		8
		 		돼지		3   뱀		9		
		 		쥐		4	말		10
		 		소		5	양		11
		 	
		 	출력 결과 :
		 		연도를 입력하세요 : 2001
		 		2001년생은 뱀띠입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연도를 입력하세요 : ");
		int year = sc.nextInt();
		String result = "";
		
		switch (year%12) {
		case 0 :
			result = "뱀";
			break;
		case 1 :
			result = "닭";
			break;
		case 2 :
			result = "개";
			break;
		case 3 :
			result = "돼지";
			break;
		case 4 :
			result = "쥐";
			break;
		case 5 :
			result = "소";
			break;
		case 6 :
			result = "호랑이";
			break;
		case 7 :
			result = "토끼";
			break;
		case 8 :
			result = "용";
			break;
		case 9 :
			result = "뱀";
			break;
		case 10 :
			result = "말";
			break;
		case 11 :
			result = "양";
		}
		
		System.out.println(year + "년생은 " + result + "띠입니다.");
		
	}

}
