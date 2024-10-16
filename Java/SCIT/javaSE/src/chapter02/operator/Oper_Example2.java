package chapter02.operator;

import java.util.Scanner;

public class Oper_Example2 {

	public static void main(String[] args) {
		/*
		 	과목 3개를 입력 받아 점수에 따른 합격 여부를 출력한다.
		 	합격 조건 :
		 		1. 세 과목의 평균 점수가 60점 이상일 것.
		 		2. 한 과목이라도 40점 미만일 경우 과락으로 불합격
		 	출력 결과 :
		 		국어 : 80
		 		영어 : 80
		 		수학 : 35
		 		합격 여부 : false
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("각 과목의 점수를 입력하시오.");
		System.out.print("국어 점수 :");
		int kor = sc.nextInt();
		System.out.print("영어 점수 :");
		int eng = sc.nextInt();
		System.out.print("수학 점수 :");
		int math = sc.nextInt();
		
		boolean check1 = ((kor+eng+math)/3.0 >= 60);
		boolean check2 = (kor >= 40) && (eng >= 40) && (math >= 40);
		
		boolean test = check1 && check2;
		
		System.out.println("합격 여부 : "+ test);
	}

}
