package chapter03.condition;

import java.util.Random;

public class C022_Switch2 {
    public static void main(String[] args) {
        // 병합처리
        Random random = new Random();
        int ranking = random.nextInt(5)+1; // 1~5
        switch (ranking) {
        case 1:
            System.out.println("대상");
            break;
        case 2:
        case 3:
            System.out.println("우수상");
            break;
        case 4:
        case 5:
            System.out.println("장려상");
            break;
        default:
            break;
        }
        double rand = Math.random();
        int month = (int) (rand * 12) + 1; // 1~12
        int days;

        switch (month) {
        case 2:
            days = 28;
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            days = 30;
            break;
        default:
            days = 31;
            break;
        }

        System.out.println(month + "월은 " + days + "일 까지 있습니다.");

    }
}