package chapter06.class_part1;

class Test1 {
	// 인스턴스 변수, 멤버 변수
	private String name1 = "홍길동";
	// 정적 멤버 변수
	public static final String name2 = "고길동";
	
	public void printName() {
		System.out.println(this.name1);
	}
}

public class C050_static1 {

	public static void main(String[] args) {
		Test1 test = new Test1() ;
//		System.out.println(test.name1);
		test.printName();
		
		System.out.println(test.name2);
		System.out.println(Test1.name2);
//		Test1.name2 = "이순신"; // final이 붙었기 때문에 출력 불가능
	}

}
