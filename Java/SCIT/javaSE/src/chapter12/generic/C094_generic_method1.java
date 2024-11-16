package chapter12.generic;

class Point<T, V> {
	T x;
	V y;
	
	Point(T x,V y) {
		this.x = x;
		this.y = y;
	}
	public T getX() { return x; }
	public V getY() { return y; }
}
public class C094_generic_method1 {

	// 제네릭 메서드 
	// 클래스에서 정의하지 않은 타입을 메서드에서 사용하고자 할때
	// 제네릭 타입을 정의하여 메서드가 호출될 때 구체적인 타입으로 변환 
	public static <T, V> double makeRectangle (
			Point<T, V> p1, Point<T, V> p2) {
		double left = ((Number) p1.getX()).doubleValue();
		double right = ((Number) p2.getX()).doubleValue();
		double top = ((Number) p1.getY()).doubleValue();
		double bottom = ((Number) p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}
	
	public static void main(String[] args) {
		Point<Integer, Double> p1 = new Point<>(0,0.0);
		Point<Integer, Double> p2 = new Point<>(10, 10.0);
		
		double rect = makeRectangle(p1, p2);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 " 
				+ rect + "입니다." );
		
		

	}

}
