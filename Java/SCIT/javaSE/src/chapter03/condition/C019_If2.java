package chapter03.condition;

public class C019_If2 
{
    public static void main(String[] args) 
    {    // if block 
        int age = 15;
        
        if (age >= 19)
        {
            System.out.println("성인입니다.");
            System.out.println("술집 입장");
        }
        System.out.println("=================");
        
        if (age >= 19)
            System.out.println("성인입니다.2");
            System.out.println("술집 입장2");    // 범위 블록 쓰셈
    }
}