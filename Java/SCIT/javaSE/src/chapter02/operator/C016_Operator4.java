package chapter02.operator;

public class C016_Operator4 {

	public static void main(String[] args) {
		// 논리 연산자
		int num1 = 10;
		int num2 = 20;
		
		// and &&
		boolean flag = (num1 > 0) && (num2 > 0);
		System.out.println(flag);
		
		flag = (num1 < 0) && (num2 < 0);
		System.out.println(flag);

		// or ||
		flag = (num1 < 0) || (num2 > 0);
		System.out.println(flag);
		
		// not 부정
		System.out.println(!flag);
		System.out.println(!false);
		
		System.out.println("==============");
		// 논리 연산자의 함정
		int num = 10;
		int i = 2;
		
		boolean value = ((num = num + 10) < 10)
				&&
				((i = i + 2) < 10);
		// 어차피 and일 때, 앞이 거짓이면 뒤는 작동할 필요도 없이 거짓
				
		System.out.println(value);
		System.out.println(num);
		System.out.println(i);
		
		num = 10;
		i = 2;
		
		value = ((num = num + 10) > 10)
				||
				((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num);
		System.out.println(i);
	}

}
