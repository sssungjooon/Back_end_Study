package chapter13.collection;

public class User {

	//멤버 변수
	private String id;			//유저 ID
	private String pw;			//유저 Password
	private String name;		//유저 이름
	private String phone;		//유저 핸드폰번호
	private String address;		//유저 주소
	
	//명시적 생성자
	public User(String id, String pw, String name, String phone, String address) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	

	//toString()
	@Override
	public String toString() {
		return String.format("> 이름: %s(%s), 핸드폰: %s, 주소: %s"
				, this.name, this.id, this.phone, this.address);
	}
	

	//Accessor: Getter & Setter
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPw() {
		return pw;
	}
	
	
}
