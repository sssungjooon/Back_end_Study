package chapter03.condition;

import java.util.Scanner;

public class If_Example06 {

	public static void main(String[] args) {
		/*
		 	BMI 계산하기
		 	BMI(체질량지수)는 몸무게를 키(미터단위)의 제곱으로 나누어서 계산하다.
		 	이 계산 결과에 따라 다음과 같이 판단된다.
		 	- 저체중 : 18.5미만
		 	- 정상 : 18.5이상, 23미만
		 	- 과체중 : 23이상 25미만
		 	- 비만 : 25이상
		 	
		 	키(cm), 몸무게를 입력받아 BMI를 계산하시오
		 	출력결과
		 	BMI지수 : 20.xxxxx (정상) 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(cm) : ");
//		int height = sc.nextInt();
		double height = sc.nextDouble();
		System.out.print("몸무게 : ");
//		int weight = sc.nextInt();
		double weight = sc.nextDouble();
		
//		float h = ((float)height/100)*((float)height/100);
//		float BMI = weight/h;

//		double h = (height/100)*(height/100);
		double BMI = weight/ Math.pow(height/100, 2);
		
		String check;
		
		if (BMI < 18.5) {
			check = "(저체중)";
		} else if (BMI >= 18.5 && BMI < 23) {
			check = "(정상)";
		} else if (BMI >= 23 && BMI < 25) {
			check = "(과체중)";
		} else {
			check = "(비만)";
		}
		
		System.out.println("BMI 지수 : " + BMI + check);
	}

}
