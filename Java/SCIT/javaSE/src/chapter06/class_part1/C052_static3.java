package chapter06.class_part1;

class Student {
	public static int serialNum = 1000; // 정적 변수, 멤버 변수
	public String studentName; // 인스턴스 변수, 멤버 변수
	
	{ // 인스턴스 초기화 블럭 (기본 생성자든, 명시적 생성자든 공통적으로 처리할게 있으면 좋다)
		serialNum++;
	}
	
	public Student() { // 기본 생성자 (클래스의 이름과 같은 메서드의 일종)
		
	}
	
	public Student(String name) { // 명시적 생성자
		this.studentName = name;
	}

	// getter/setter 자동생성 단축키 : alt + shift + s 후에 r
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}

public class C052_static3 {

	public static void main(String[] args) {
		System.out.println("기존 학번: " + Student.serialNum);
		
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println("이지원의 학번: " + studentLee.serialNum);
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		System.out.println("손수경의 학번: " + studentSon.serialNum);
		
		Student studentPark = new Student("박미경");
		System.out.println("박미경의 학번: " + studentPark.serialNum );
	}

}
