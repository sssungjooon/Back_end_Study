package chapter02.operator;

public class C013_Operator1 {

	public static void main(String[] args) {
		// 산술 연산자
		int a = 6, b = 4;
		System.out.println(a + " + " + b +  " = " + (a+b));
		System.out.println(a + " - " + b +  " = " + (a-b));
		System.out.println(a + " * " + b +  " = " + (a*b));
		System.out.println(a + " / " + b +  " = " + (a/b));
		System.out.println(a + " / " + b +  " = " + ((float) a/b));
		
		// % 연산자 
		System.out.println("6 % 4 = " + 6 % 4);
		System.out.println("7 % 3 = " + 7 % 3);
		System.out.println("15 % 2 = " + 15 % 2);
	}

}
