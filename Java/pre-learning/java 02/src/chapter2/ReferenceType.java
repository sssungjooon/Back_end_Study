package chapter2;

public class ReferenceType {
	int x, y;
	
	// 생성자 - 객체를 생성할 때, 멤버 변수를 초기화 하는 역할을 하는 특수한 메서드
	public ReferenceType(int newX, int newY) {
		x = newX;
		y = newY;
	}

	public static void main(String[] args) {
		// rt1, rt2는 객체라고 한다.
		ReferenceType rt1 = new ReferenceType(10, 20);
		ReferenceType rt2 = new ReferenceType(30, 40);
		
		System.out.println("rt1.x : "+rt1.x+", rt1.y : "+rt1.y);
		System.out.println("rt2.x : "+rt2.x+", rt2.y : "+rt2.y);
	}

}
