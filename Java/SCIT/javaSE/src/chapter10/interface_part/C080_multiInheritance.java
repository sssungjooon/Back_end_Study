package chapter10.interface_part;

class HandPhone {
	void call() {
		System.out.println("전화를 건다.");
	}
	void receive() {
		System.out.println("전화를 받는다.");
	}
}
interface Camera {
	void takepicture();
}

class HandPhoneCamera extends HandPhone
					  implements Camera {
	@Override
	public void takepicture() {
		System.out.println("찰칵, 사진을 찍는다");
	}
}

public class C080_multiInheritance {

	public static void main(String[] args) {
		HandPhoneCamera myphone = new HandPhoneCamera();
		myphone.call();
		myphone.receive();
		myphone.takepicture();

	}

}

interface A {}
interface B {}
class C {}
class D extends C implements A,B {}
interface E extends A, B {}
