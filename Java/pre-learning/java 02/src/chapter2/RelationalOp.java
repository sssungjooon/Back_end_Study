package chapter2;

public class RelationalOp {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		String x = new String("Hello World");
		String y = new String("Hello World");
		
		System.out.println(a == b);
		// x와 y의 참조값을 비교
		System.out.println(x == y);
		// x와 y의 객체값을 비교
		System.out.println(x.equals(y));
		
		String x1 = "Hello World";
		String y1 = "Hello World";
		
		System.out.println(x1 == y1);
	}

}
