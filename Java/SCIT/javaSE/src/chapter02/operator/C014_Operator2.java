package chapter02.operator;

public class C014_Operator2 {

	public static void main(String[] args) {
		// 대입 연산자
		int a, b, c, sum;
		a = 3; b = 4; c = 5;
		sum = a + b + c;
		System.out.println(sum);
		
		// 관계 연산자
		int num = 10;
		System.out.println(num > 3);
		System.out.println(num < 3);
		System.out.println(num >= 3);
		System.out.println(num <= 3);
		System.out.println(num == 3);
		System.out.println(num != 3);
		
		// 복합 관계 연산자
		int num2 = 3;
		System.out.println(num2 += 3);
		System.out.println(num2 -= 3);
		System.out.println(num2 *= 3);
		System.out.println(num2 /= 3);
		System.out.println(num2 %= 3);
	}

}
