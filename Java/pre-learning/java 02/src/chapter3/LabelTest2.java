package chapter3;

public class LabelTest2 {

	public static void main(String[] args) {
		OUTER:
		for(int i=1; i<=10; i++) {
			for(char ch='a'; ch <= 'z'; ch++) {
				System.out.print(ch+" ");
				if(ch == 'g') continue OUTER;
			}//inner for
			System.out.println();
		}//outer for
	}
}
