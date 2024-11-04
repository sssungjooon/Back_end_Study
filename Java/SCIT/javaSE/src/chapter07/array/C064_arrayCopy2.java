package chapter07.array;

public class C064_arrayCopy2 {
    public static void main(String[] args) {
        int[] array1 = new int[] { 1, 2, 3, 4, 5 };
        int newLength = 10;

        System.out.println("=== for 문을 이용한 복사 ===");
        int[] array2 = new int[newLength];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }

        for (int i : array2) {
            System.out.print(i + " ");
        }

        System.out.println("\n=== System.arrayCopy()===");
        int[] array3 = new int[newLength];
        // System.arrayCopy(a,b,c,d,e)
        // a : 복사할 배열
        // b : 복사할 첫 위치
        // c : 대상 배열
        // d : 붙여 넣을 첫 위치
        // e : 복사할 요소 개수
        System.arraycopy(array1, 0, array3, 0, array1.length);
        // 출력
        for (int i : array3) {
            System.out.print(i + " ");
        }

    }
}