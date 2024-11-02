package chapter06.class_part1;

public class Class_Example01 {

	public static void main(String[] args) {
		Character cha1 = new Character ("불주먹", "평민");
		cha1.info();
		cha1.skill();
		
		Character cha2 = new Character ("주먹펴고일어서", "전사", 99, 180, 75, 20);
		cha2.info();
		cha2.skill();
		
		Character cha3 = new Character ("하인즈", "마법사", 99, 20, 90, 200);
		cha3.info();
		cha3.skill();
		
		System.out.println("===== printf 출력 서식 =====");
		int i = 123;
		double d = 3.14;
		String str = "안녕";
		System.out.println("i=" + i + ", d=" + d + ", str=" + str);
		System.out.printf("i=%d, d=%f, str=%s \n", i, d, str);
		
		// 인덱스 지정자 : 포맷 지정자 앞에 위치하여 출력할 값의 순서를 지정 
		System.out.printf("i=%3$d, d=%2$f, str=%1$s \n", str, d, i);
		System.out.printf("정수=%1$d, i=%1$d \n", i, 100);
		
		d = 3.14159265;
		System.out.printf("__%d__ \n",i);
		System.out.printf("__%5d__ \n",i);  //5자리
		System.out.printf("__%-5d__ \n",i); // 5자리인데 왼쪽부터
		System.out.printf("__%05d__ \n",i); // 5자리인데 빈자리는 0을 출력
		System.out.printf("__%6.2f__ \n",d); // 소수점 포함 6자리에 소수부 2자리
		System.out.printf("__%8.4f__ \n",d); // 소수점 포함 8자리에 소수부 4자리 
	}

}
