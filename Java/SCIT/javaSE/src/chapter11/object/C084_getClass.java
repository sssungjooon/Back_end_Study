package chapter11.object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class C084_getClass {

	public static void main(String[] args) {
/*
 		Class 클래스
 		xxx.java > 컴파일 > xxx.class
 		xxx.class 파일에는 클래스, 인터페이스에 대한 변수, 메서드, 생성자 등의
 		정보가 존재
 		Class 클래스는 컴파일된 xxx.class 파일에 저장된 클래스나
 		인터페이스 등의 정보를 가져오는데 사용한다. 
 */
		Human kim = new Human(29, "김상형");
		
		//1. Object의 getClass() 메서드 이용
		Class cls = kim.getClass();
		System.out.println("cls : " + cls);

		//2. 직접 class 파일 대입
		Class cls2 = Human.class;
		System.out.println("cls2 : " + cls2.getName());
		
		//3. 클래스 이름으로 가져오기
		Class cls3;
		try {
			cls3 = Class.forName("chapter11.object.Human");
			System.out.println("cls3 : " + cls3.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 슈퍼클래스의 Class 객체를 반환
		Object obj = cls.getSuperclass();
		System.out.println(obj instanceof Object);
		System.out.println(obj instanceof Human);
		System.out.println("슈퍼 클래스 : " +
				cls.getSuperclass().getName());
		
		// 멤버 변수
		System.out.print("필드 : ");
		Field[] fields = cls.getDeclaredFields();
		for (Field f : fields) {
			System.out.print(f.getName() + " ");
		}
		System.out.println();
		
		// 멤버 메서드
		System.out.println("멤버 메서드 : ");
		Method[] methods = cls.getDeclaredMethods();
		for (Method m : methods) {
			System.out.print(m.getName()+ " ");
		}
	}

}
