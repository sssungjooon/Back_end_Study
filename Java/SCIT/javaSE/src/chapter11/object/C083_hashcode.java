package chapter11.object;

class Student {
	String name;
	int stdNum;
	
	Student () { }
		Student(String name, int stdNum) {
			this.name = name;
			this.stdNum = stdNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)	// 주소값 비교, 같은 인스턴스인지
			return true;
		if (obj == null)	// null 값 체크
			return false;
		if (getClass() != obj.getClass()) // 같은 클래스인지
			return false;
		Student other = (Student) obj;
		if (this.stdNum != other.stdNum) // 학번이 같은지 
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		return this.stdNum;
	}
}

public class C083_hashcode {

	public static void main(String[] args) {
		Student st1 = new Student("홍길동", 20240001);
		Student st2 = new Student("홍길동", 20240001);
		Student st3 = st1;
		Student st4 = new Student("홍길동", 20240003);
		
		System.out.println("=== 주소 ===");
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println(st1 == st4);
		
		System.out.println("=== equals === ");
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st1.equals(st4));
		
		System.out.println("=== hashcode === ");
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		System.out.println(st4.hashCode());

	}

}
