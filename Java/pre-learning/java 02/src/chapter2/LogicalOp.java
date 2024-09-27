package chapter2;

public class LogicalOp {

	public static void main(String[] args) {
		int i = 10;
		
		System.out.println((i != 0) && (100/i > 10));
		// 왼쪽이 True, 오른쪽이 False라서 False
		
		System.out.println((i == 10) || (100/i > 10));
		// 왼쪽이 True, 오른쪽이 False라서 True
		
		System.out.println((i < 0) ^ (i == 10));
		// 왼쪽이 False, 오른쪽이 True라서 True
		
		System.out.println(!(i > 1));
		// True를 False로, False를 True로 
	}

}
