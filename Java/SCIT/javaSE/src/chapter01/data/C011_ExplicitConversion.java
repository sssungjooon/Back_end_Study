package chapter01.data;

public class C011_ExplicitConversion {

	public static void main(String[] args) {
		// 명시적 형변환 (강제 형변환)
		int iNum = 10;
		byte bNum = (byte)iNum;
		
		double dNum = 3.14;
		int iNum2 = (int)dNum;
		
		System.out.println(bNum);
		System.out.println(iNum2);
	}

}
