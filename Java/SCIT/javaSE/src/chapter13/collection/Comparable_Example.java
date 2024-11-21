package chapter13.collection;

import java.util.Set;
import java.util.TreeSet;

class Member implements Comparable<Member> {
	String name;
	int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Member o) {
		return this.name.compareTo(o.name);
		// 역순으로 나오게 하고싶을 때 * -1 
//		return this.name.compareTo(o.name) * -1; 
	}
	
	@Override
	public String toString() {
		return "이름: " + name + ", 나이: " + age; 
	}
}

public class Comparable_Example {

	public static void main(String[] args) {
/*
 		Comparable : 자신과 매개변수 객체를 비교
 */
		Set<Member> set = new TreeSet<>();
		set.add(new Member("홍길동", 20));
		set.add(new Member("강감찬", 50));
		set.add(new Member("이순신", 35));
		
		for (Member m : set) {
			System.out.println(m);
		}
		
		
	}

}
