package chapter03.condition;

public class C023_Switch3 {
    public static void main(String[] args) {
        // 문자열
        String country = "China";

        switch (country) {
        case "Korea":
            System.out.println("Seoul");
            break;
        case "China":
            System.out.println("Beijing");
            break;
        case "Japen":
            System.out.println("Tokyo");
            break;
        default:
            break;
        }

        // 값 비교 ==, 객체.equals()
        // 문자열 비교
        String a = "안녕";
        String b = "안녕"; // 메모리 낭비를 막기위해 a 의 주소를 참조
        System.out.println(a == b);

        String c = new String("안녕"); // 새로 만든 객체이기 때문에 a 와 주소 값이 다르다
        System.out.println(a == c);
        
        // 문자열이 동일한지를 비교해주는 메서드
        System.out.println(a.equals(c)); // 주소말고 실제 내용이 같은지 비교

    }
}