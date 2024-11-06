package chapter07.array;

import java.util.Random;

public class Array_Example_Random {

	public static void main(String[] args) {
		// 난수를 발생시키는 방법
		
		// Math 클래스의 random 메서드를 호출 ( 0 ~ 9 )
		double num = Math.random();
		int num2 = (int) (Math.random() * 10);
		System.out.println(num);
		System.out.println(num2);
		
		// Random 클래스의 객체를 생성하여 난수 발생 ( 0 ~ 9 )
		Random r = new Random();
		int num3 = r.nextInt(10);
		System.out.println(num3);

	}

}
