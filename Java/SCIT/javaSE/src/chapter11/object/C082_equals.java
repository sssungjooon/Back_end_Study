package chapter11.object;

public class C082_equals {

	public static void main(String[] args) {
		Human kim = new Human(29,"김상형");
		Human lee = new Human(43,"이승우");
		Human kimcopy = kim;
		Human kim2 = new Human(29,"김상형");
		
		// 참조 주소값 비교
		System.out.println("kim == lee : "+ (kim == lee));
		System.out.println("kim == kimcopy :"+ (kim == kimcopy));
		System.out.println("kim == kim2 : " + (kim == kim2));
		
		// 객체 동일 비교 
		System.out.println("kim == lee : "+ kim.equals(lee));
		System.out.println("kim == kimcopy :"+ kim.equals(kimcopy));
		System.out.println("kim == kim2 : " + kim.equals(kim2));
	}

}
