package chapter05.method;

public class C040_method_valueCheck {

	public static void main(String[] args) {
		int num = 2;
		getDouble(num);
		int result = getDouble(num);
		System.out.println("num = " + num);
		System.out.println("result = " + result);
		
		int[] arr = { 2, 8, 6 };
		getDouble(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}
	
	public static int getDouble(int value) {
		value *= 2;
		return value;
	}
	
	public static void getDouble(int[] value) {
		value[0] *= 2;
	}

}
