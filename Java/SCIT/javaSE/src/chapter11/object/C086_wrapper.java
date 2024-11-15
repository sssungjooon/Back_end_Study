package chapter11.object;

public class C086_wrapper {

	public static void main(String[] args) {
/*
		기본형				Wrapper클래스
		boolean			Boolean
		byte			Byte
		char			Character
		short			Short
		int				Integer
		long			Long
		float			Float
		double			Double 
 */
		
		// boxing 기본형 -> 참조형
		int i = 1234;
		Integer wrapint = new Integer(i);
		String str = wrapint.toString();
		System.out.println(str);
		
		String a = "56", b = "78";
		System.out.println(a+b);
		System.out.println(Integer.parseInt(a)
				+ Integer.parseInt(b));

		// unboxing 참조형 -> 기본형
		Integer wrapint2 = new Integer(629);
		int j = wrapint2.intValue();
		System.out.println(j);
		
		Double wrapDouble = new Double("3.14");
		double di1 = wrapDouble.doubleValue();
		int di2 = wrapDouble.intValue();
		System.out.println(di1);
		System.out.println(di2);
		
		//autoboxing
		Integer c = new Integer(3);
		Integer d = new Integer(4);
		int e = c + d;
		System.out.println(e);
		
		System.out.printf("int 타입의 크기=%d"
				+ ", 최소값=%d, 최대값=%d \n"
				, Integer.SIZE
				, Integer.MIN_VALUE
				, Integer.MAX_VALUE);
		
	}

}
