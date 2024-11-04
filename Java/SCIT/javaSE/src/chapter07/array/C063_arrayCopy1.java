package chapter07.array;


class A {
    
}

public class C063_arrayCopy1 {
    public static void main(String[] args) {
        int i = 123, i2 = 123;
        int[] ar = { 1, 2, 3 }, ar2 = { 1, 2, 3 };
        int[] ar3 = ar;
        A a = new A();

        System.out.println("i와 i2 : " + (i == i2 ? "같다" : "다르다"));
        System.out.println("ar 과 ar2 : " + (ar == ar2 ? "같다" : "다르다"));
        System.out.println("ar : " + ar);
        System.out.println("ar2 : " + ar2);
        System.out.println("ar 과 ar3 : " + (ar == ar3 ? "같다" : "다르다"));
        System.out.println("ar : " + ar);
        System.out.println("ar3 : " + ar3);
        System.out.println(args);
        System.out.println(a);
    }
}