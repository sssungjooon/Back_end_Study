package chapter07.array;

public class C054_array1 {

	public static void main(String[] args) {
		// 배열 선언, 초기화
		int[] arr1 = new int[5];	// 타입[] 배열명;
		int arr2[] = new int[5];	// 타입 배열명[];
		
		int[] arr3 = new int[] {0, 1, 2, 3, 4};
		int arr4[] = {0, 1, 2, 3, 4};
		
		// 배열 자료형 선언
		int[] arr5;				// 먼저 선언되면
		arr5 = new int[] {6, 7, 8};  // new int[]를 생략할 수 없음
		
		int arr6[];
//		arr6 = {9, 10, 11};			// err
		
		for (int i=0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		
		System.out.println("배열 길이: " + arr3.length);
	}

}
