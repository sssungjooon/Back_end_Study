package chapter04.loop;

public class C035_continue {

	public static void main(String[] args) {
		// continue
		for (int i = 1; i <= 10; i++) {
			if (i == 7) 
				continue;
			System.out.println("반복회차: " + i);
		}
		
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0)
				continue;
			sum += i;
		}
		System.out.println("for문 : " +sum);
		
		// 짝수의 합 (while, do-while)
		int sum2 = 0;
		int j = 1;
		while (j <= 100) {
			if (j % 2 == 0) {
				sum2 += j;
			}
			j++;
		}
		System.out.println("while문 : " +sum2);
		
		int sum3 = 0;
		int t = 1;
		do {
			if (t % 2 == 0) {
				sum3 += t;
			}
			t++;
		} while (t <= 100);
		// do-while문 선생님 풀이
		/*
		 	do {
		 		sum3 += t;
		 		t += 2;
		 	} while (t <= 100);
		 */
		System.out.println("do-while문 : " + sum3);
		
	}

}
