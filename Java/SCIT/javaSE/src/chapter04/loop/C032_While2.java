package chapter04.loop;

public class C032_While2 {

	public static void main(String[] args) {
		// 1 ~ 100 합
		int sum = 0;
		int i = 1;
		
		while (i <= 100) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}

}
