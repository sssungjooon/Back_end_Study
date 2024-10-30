package chapter06.class_part1;

public class C051_static2 {

	// static 영역에 존재하는 메서드라서 인스턴스 생성 업시도 호출이 가능한 메서드
	public static int add(int x, int y) {
		return x + y;
	}
	
	// non-static 영역에 존재하는 메서드라서 인스턴스를 생성한 후에나 사용가능한 메서드
	public int minus(int x, int y) {
		return x - y;
	}
	
	public static void main(String[] args) {
		int sum = add(1,2);
		System.out.println(sum);
		
		C051_static2 instance = new C051_static2();
		int result = instance.minus(5, 4);
		System.out.println(result);

	}

}
