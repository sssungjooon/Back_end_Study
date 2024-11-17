package chapter12.generic;

import java.util.ArrayList;

// 다중타입 한정(T extends A & B)
interface Readable {}
interface Closeable {}

class BoxType implements Readable, Closeable {}
class BoxType2 implements Readable {}
class Box<T extends Readable & Closeable> {
	ArrayList<T> list = new ArrayList<>();
	
	public void add(T item) {
		list.add(item);
	}
}


public class C097_generic_range2 {

	public static void main(String[] args) {
		Box<BoxType> box = new Box<>();
		// Readable와 Closeable을 동시에 구현한 클래스만 타입 할당 가능 
//		Box<BoxType2> box2 = new Box<>(); 
		
//		Box<Object> box2 = new Box<>(); 
		
	}

}
