package chapter04.loop;

public class C034_break {

	public static void main(String[] args) {
		// break
		for (int i = 1; i <= 10; i++) {
			if (i == 7)
				break;
			System.out.println("반복회차 : " + i);
		}
		
		System.out.println("==========");
		// exit label
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 3 && j == 3) 
					break;
				System.out.print("0 ");
			}
			System.out.println();
		}
		System.out.println("==========");
		loop:
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 3 && j == 3) 
					break loop;
				System.out.print("0 ");
			}	
			System.out.println();
		}
	}
}
