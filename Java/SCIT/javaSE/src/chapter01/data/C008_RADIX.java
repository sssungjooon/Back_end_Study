package chapter01.data;

public class C008_RADIX {

	public static void main(String[] args) {
		// radix (기수, 진수)
		int a = 10;     
		int b = 015;     // 0으로 시작하면 8진수
		int c = 0x10;    // 0x, 0X로 시작하면 16진수
		int d = 0b1001;  // 0b, 0B로 시작하면 2진수 
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
