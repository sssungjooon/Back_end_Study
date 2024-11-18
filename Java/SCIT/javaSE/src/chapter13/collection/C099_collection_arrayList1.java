package chapter13.collection;

import java.util.ArrayList;
import java.util.List;

public class C099_collection_arrayList1 {

	public static void main(String[] args) {
		// List <- ArrayList
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2, 5); // index 2번에 5의 값을 추가
		
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		
		list.remove(0); // index 0번 값 제거
		System.out.println();
		
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("get(index): " + list.get(1));
		System.out.println("size(): " + list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+ " ");
		}

	}

}
