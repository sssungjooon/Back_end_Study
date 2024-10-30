package chapter06.class_part1;

/*
 	멤버 변수의 경우 보통 private 를 사용하여 외부로부터의 직접적인 접근을 막고,
 	getter/setter 라 부르는 멤버 메서드를 만들어 사용함으로써
 	내부 데이터에 제한적 접근을 할 수 있게 한다. 
 */

class Member {
	private String id;
	private String password;
	private String phonenumber;
	
	public Member(String id, String password, String phonenumber) {
		this.id = id;
		this.password = password;
		this.phonenumber = phonenumber;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getId() {
		return id;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void memberInfo(String pwCheck) {
		if (this.password.equals(pwCheck)) {
			System.out.println("[ 회원 정보 ]");
			System.out.println(" *아이디: " + this.id);
			System.out.println(" *전화번호: " + this.phonenumber);
		}
	}
	
	
}

public class C049_encapsulation {

	public static void main(String[] args) {
		Member member = new Member("hong","123","01012345678");
//		System.out.println(member.id); //err > 직접적인 접근 불가 
		System.out.println(member.getId());
		member.memberInfo("123");
		
		System.out.println("=== 비밀번호 변경 후 ===");
		member.setPassword("000");
		member.memberInfo("000");
		

	}

}
