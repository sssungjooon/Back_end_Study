package chapter03.condition;

public class C020_If3 {
    public static void main(String[] args) {
        // if 중첩
        int age = 25;
        boolean man = false;

        if (age >= 19) {
            if (man) {
                System.out.println("성인 남성: 25000원");
            } else {
                System.out.println("성인 여성: 23000원");
            }

        } else {
            System.out.println("청소년: 15000원");
        }
    }
}