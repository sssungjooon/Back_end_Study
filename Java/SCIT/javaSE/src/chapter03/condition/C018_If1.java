package chapter03.condition;

public class C018_If1 
{
    public static void main(String[] args) 
    {    // if문
        int age = 11;
        
        if (age >= 19)
        {
            System.out.println("성인입니다.");
            System.out.println("출력");
        }
        if (age >= 19)
            System.out.println("성인입니다.2");
            System.out.println("출력2"); // 이녀석은 if안걸림 {}없으면 바로아래 한개만 적용
            System.out.println("=================");
            
        // if - else 문 
        if (age >= 19)
            System.out.println("성인입니다.");
        else
            System.out.println("어린이입니다.");
        System.out.println("=================");
        
        // if - else if - else 문
        if (age >= 19)
            System.out.println("성인입니다.");
        else if (age > 12)    // 12 < age <= 19
            System.out.println("청소년입니다.");
        else                // age <= 12
            System.out.println("어린이입니다.");
        System.out.println("=================");
        
        // if - else if 문
        if (age >= 19)
            System.out.println("성인입니다.");
        else if (age > 12)    // 12 < age <= 19
            System.out.println("청소년입니다.");
        else if (age > 5)    //    5 < age <= 12
            System.out.println("유아입니다.");
    }
}