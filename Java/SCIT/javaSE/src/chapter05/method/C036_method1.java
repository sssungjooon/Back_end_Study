package chapter05.method;

public class C036_method1 {

	public static void main(String[] args) {
		// 1 ~ 10까지의 합
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("1 ~ 10 = " + sum);
		
		System.out.println("1 ~ 10 = " + calcSum(1,10));
		
		// 15 ~ 100까지의 합
		int sum2 = 0;
		for (int i=15; i <= 100; i++) {
			sum2 += i;
		}
		System.out.println("15 ~ 100 = " + sum2);
		
		System.out.println("15 ~ 100 = " + calcSum(15,100));
	}
	
	// 메서드 정의 부분 
	public static int calcSum(int from, int to) {
		int sum = 0;
		for (int i = from; i <= to; i++) {
			sum += i;
		}
		return sum;
	}

}
