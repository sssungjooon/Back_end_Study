package chapter03.condition;

import java.util.Random;

public class C024_Switch4 {
    public static void main(String[] args) {
        // switch문 활용
        Random random = new Random();

        int score = random.nextInt(61) + 40;

        switch (score / 10) {
        case 10:
        case 9:
            System.out.println("A");
            break;
        case 8:
            System.out.println("B");
            break;
        case 7:
            System.out.println("C");
            break;
        case 6:
            System.out.println("D");
            break;
        default:
            System.out.println("F");
            break;
        }
    }
}