package chapter2;
// 패키지 : 기능이 유사한 클래스들의 묶음 
// 현재 클래스와 다른 패키지에 있는 클래스를 불러와서 사용하는 방법
// Scanner 클래스 : 여러 입력장치로부터 데이터를 읽는 기능을 갖는 클래스 
import java.util.Scanner;


public class Ifelse1 {

	public static void main(String[] args) {
		// println() : 출력 후 개행을 한다
		// print() : 출력 후 개행하지 않는다.
		System.out.println("점수를 입력하세요:");
		// Scanner 클래스의 생성자에는 입력장치에 대한 정보(객체)를 넣는다.
		// System.in : 표준입력 장치에 대한 정보를 갖는 객체
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		// System.out.println(score);
		
		if (score >= 70) {
			System.out.print("합격입니다.");
		} else {
			System.out.print("불합격입니다.");
		}
	}

}
