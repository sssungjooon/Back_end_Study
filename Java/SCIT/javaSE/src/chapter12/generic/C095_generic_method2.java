package chapter12.generic;

class GenericTest<T, U> {
	// 클래스의 제네릭 타입으로 운영되는 제네릭 메서드
	void method1 (T t, U u) {
		System.out.println(t + ", " + u);
	}
	
	// 독립적으로 운영되는 제네릭 메서드
	<K, V> void method2(K k, V v) {
		System.out.println(k + ", " + v);
	}
}

public class C095_generic_method2 {

	public static void main(String[] args) {
		GenericTest<String, Integer> gt = new GenericTest<>();
		gt.method1("안녕", 123);
		gt.method2(3.14, 999);

	}

}
