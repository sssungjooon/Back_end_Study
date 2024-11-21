package chapter13.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Person {
	String name;
	int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name +
				", age= " + age + "]";
	}
}

class PersonNameComparator implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		return p1.name.compareTo(p2.name);
	}
}

public class Comparator_Example {

	public static void main(String[] args) {
		// 1. Comparator를 구현한 클래스를 이용하는 방법
		List<Person> list = new ArrayList<>();
		list.add(new Person("홍길동", 30));
		list.add(new Person("강감찬", 80));
		list.add(new Person("이순신", 45));

		Collections.sort(list, new PersonNameComparator());
		
		for (Person p : list) {
			System.out.println(p);
		}
		
		System.out.println("============");
		// 2. 익명객체를 이용하는 방법
		Set<Person> set = 
				new TreeSet<>(new Comparator<Person>() {
					@Override
					public int compare(Person o1, Person o2) {
						return o1.name.compareTo(o2.name);
					}
				});
		set.add(new Person("홍길동", 30));
		set.add(new Person("강감찬", 80));
		set.add(new Person("이순신", 45));
		
		for (Person p : set) {
			System.out.println(p);
		}
	}

}
