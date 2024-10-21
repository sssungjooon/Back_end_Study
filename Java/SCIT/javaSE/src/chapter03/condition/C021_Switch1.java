package chapter03.condition;

public class C021_Switch1 
{
    public static void main(String[] args) 
    {    // switch - case 문
        int ranking = 1;
        
        switch (ranking)    // 자판기라고 생각하면 편하다
        {                    // break 다 지우면 무슨일이?
            case 1: 
                System.out.println("축하합니다. 금메달");
                break;        // break -> switch문 종료
            case 2: 
                System.out.println("은메달");
                break;
            case 3: 
                System.out.println("동메달");
                break;
            default:
                System.out.println("참가상");
                break;
        }
    }
}