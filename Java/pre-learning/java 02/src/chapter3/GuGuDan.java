package chapter3;

public class GuGuDan {

	public static void main(String[] args) {
		for (int i=2; i<10; i++ ) {
			System.out.println("======="+i+"단=======");			
			for(int j=1; j<=9; j++) {
				System.out.println(i + "X" + j + "=" + (i*j));
			} // inner for
		} // outer for	
	} 

}
