package chapter13.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class C101_collection_linkedList1 {

	public static void main(String[] args) {
		List<String> arName = new LinkedList<String>();
		
		arName.add("홍길동");
		arName.add("이순신");
		arName.add("강감찬");
		arName.add(1, "고길동");
		arName.remove("고길동");
		
		for (String s: arName) {
			System.out.println(s);
		}
		
		/*
		 	Iterator
		 		- 컬렉션 구조에 상관없이 일관된 접근 방법 제공
		 		- 컬렉션 요소의 안전한 삭제 가능
		 		
		 	메서드 
		 		next() : Iterator의 현재 위치에서 다음 요소를 반환
		 		hasNext() : 다음에 읽을 요소가 있는지를 확인
		 		remove() : 마지막으로 반환된 요소를 컬렉션에서 제거 
		 */
		// Iterator 반복자
		System.out.println("========");
		Iterator<String> it = arName.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		// ListIterator 양방향 반복자
		System.out.println("========");
		ListIterator<String> it2 = arName.listIterator(arName.size());
		while (it2.hasPrevious()) {
			System.out.println(it2.previous());
		}

	}

}
