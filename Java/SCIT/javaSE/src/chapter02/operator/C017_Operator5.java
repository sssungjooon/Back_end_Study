package chapter02.operator;

import java.util.Scanner;

public class C017_Operator5 {

	public static void main(String[] args) {
		// 조건 연산자 & 삼항 연산자
		// 조건식 ? 결과1 : 결과2
		int fatherAge = 45;
		int motherAge = 47;
		
		String result = (fatherAge > motherAge)
						?
						"아빠가 연상"
						:
						"엄마가 연상";
		System.out.println(result);
		
		boolean result2 = (fatherAge > motherAge)
				?
				true
				:
				false;
		System.out.println(result2);
		
		System.out.println("============");
		// 위의 예제를 입력을 통해 출력해보세요.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아빠의 나이는 : ");
		int fatherAge2 = scan.nextInt();
		System.out.print("엄마의 나이는 : ");
		int motherAge2 = scan.nextInt();
		
		String result3 = (fatherAge2 > motherAge2)
				?
				"아빠가 연상"
				:
				"엄마가 연상";
		System.out.println(result3);
	}

}
