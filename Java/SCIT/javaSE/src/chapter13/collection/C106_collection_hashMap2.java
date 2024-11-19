package chapter13.collection;

import java.util.HashMap;
import java.util.Objects;

class Human {
	int age;
	String name;
	
	Human (int age, String name ) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return name.length() + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Human) {
			Human other = (Human) obj;
			return (age == other.age 
					&& name.equals(other.name));
		} else 
			return false;
	}
}

public class C106_collection_hashMap2 { 

	public static void main(String[] args) {
		HashMap<Human, Integer> donate = new HashMap<>();
		donate.put(new Human(42,"김기남"), 10000);
		donate.put(new Human(24,"박수빈"), 20000);
		donate.put(new Human(20,"박수현"), 5000);
		donate.put(new Human(11,"최상미"), 8000);

		Human park = new Human(20, "박수현");
		System.out.println(park.name + "씨의 기부금 : " 
				+ donate.get(park));
		
		

	}

}
