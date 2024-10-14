package chapter01.data;

public class Example03 {

	public static void main(String[] args) {
		/*
		 	변수의 교환
		 	출력 결과 :
		 		교환 전
		 		x = 100
		 		y = 200
		 		교환 후
		 		x = 200
		 		y = 100 
		 */
		
		int x = 100;
		int y = 200;
		
		System.out.println("교환 전");
		System.out.println("x =" + x);
		System.out.println("y =" + y);
		System.out.println("교환 후");
		
//		y = y - x;
//		x = x + x; 
		
		int z;
		z = x;
		x = y;
		y = z;
		
		System.out.println("x =" + x);
		System.out.println("y =" + y);

	}

}
