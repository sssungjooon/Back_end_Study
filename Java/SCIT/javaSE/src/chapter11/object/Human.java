package chapter11.object;

/*
	Cloneable 인터페이스는 클래스가 복제될 수 있음을 명시적으로 표현
	이를 구현하지 않으면 clone() 메서드를 호출할 수 없도록 하여
	복제 작업을 안전하게 관리
 */

public class Human implements Cloneable {
	int age;
	String name;
	
	int[] score = new int[] {1, 2, 3};
	
	Human(int age, String name){
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return age + "세의 " + name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Human) {
			Human other = (Human) obj;
			return (age == other.age
					&& name.equals(other.name));
		} else {
			return false;
		}
	}
	
	@Override
	public Object clone() {
		try {
			Human other = (Human) super.clone();
			other.score = this.score.clone();
			return other;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

}
