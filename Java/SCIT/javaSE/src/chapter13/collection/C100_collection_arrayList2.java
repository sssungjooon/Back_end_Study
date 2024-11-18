package chapter13.collection;

import java.util.ArrayList;

class Student {
	String name;
	int stdNum;
	
	Student(String name,int stdNum) {
		this.name = name;
		this.stdNum = stdNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStdNum() {
		return stdNum;
	}

	public void setStdNum(int stdNum) {
		this.stdNum = stdNum;
	}
}

public class C100_collection_arrayList2 {

	public static void main(String[] args) {
		ArrayList<Student> stList = new ArrayList<>();
		stList.add(new Student("홍길동", 20241001));
		stList.add(new Student("이순신", 20241002));
		stList.add(new Student("강감찬", 20241003));
		
		for (int i = 0; i < stList.size(); i++) {
			String result = String.format("이름: %s, 학번: %d"
					, stList.get(i).getName()
					, stList.get(i).getStdNum());
			System.out.println(result);
		}

	}

}
