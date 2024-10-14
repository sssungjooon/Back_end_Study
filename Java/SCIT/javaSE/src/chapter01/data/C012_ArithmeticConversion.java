package chapter01.data;

public class C012_ArithmeticConversion {

	public static void main(String[] args) {
		// 연산 중 형 변환 (산술 형변환)
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int) dNum1 + (int) fNum2;
		int iNum4 = (int) (dNum1 +  fNum2);
		double iNum5 = dNum1 + fNum2;
		
		System.out.println(iNum3);
		System.out.println(iNum4);
		System.out.println(iNum5);

	}

}
