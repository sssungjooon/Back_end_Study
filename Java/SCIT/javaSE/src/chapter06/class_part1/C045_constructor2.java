package chapter06.class_part1;

public class C045_constructor2 {

	public static void main(String[] args) {
		Time t = new Time();
		t.whatTime();

		Time t2 = new Time(true, 10, 12, 34);
		t2.whatTime();
		
		Time t3 = new Time(true, 12, 34);
		t3.whatTime();
	}

}
