package chapter11.object;

public class C088_stringBuffer {

	public static void main(String[] args) {
/*
 		String
 		불변성을 갖는다 (Immutable)
 		StringBuilder, StringBuffer
 		가변성을 갖는다 (mutable)
 		- 처리속도 : StringBuilder > StringBuffer > String
 */
		String str = "strA";
		String str2 = new String("strA");
		StringBuilder sbd = new StringBuilder();
		sbd.append("sbdA");
		StringBuffer sbf = new StringBuffer();
		sbf.append("sbfA");
		
		System.out.println("=== 출력 ===");
		System.out.println(str);
		System.out.println(str2);
		System.out.println(sbd);
		System.out.println(sbf);
		
		System.out.println("String 객체의 hashcode : "
				+ str.hashCode());
		System.out.println("String2 객체의 hashcode : "
				+ str2.hashCode());
		System.out.println("String == String2 : "
				+ (str == str2));
		System.out.println("StringBuilder 객체 hashcode : "
				+ sbd.hashCode());
		System.out.println("StringBuffer 객체 hashcode : "
				+ sbf.hashCode());
		
		// 데이터 수정 후 비교
		str += "strB";
		str2 += "strB";
		sbd.append("sbdB");
		sbf.append("sbfB");
		System.out.println("=== 수정 후 ===");
		System.out.println("=== 출력2 ===");
		System.out.println(str);
		System.out.println(str2);
		System.out.println(sbd);
		System.out.println(sbf);
		
		System.out.println("String 객체의 hashcode : "
				+ str.hashCode());
		System.out.println("StringBuilder 객체 hashcode : "
				+ sbd.hashCode());
		System.out.println("StringBuffer 객체 hashcode : "
				+ sbf.hashCode());
		
		System.out.println("=== 속도 비교 ===");
		long start = System.currentTimeMillis();
		String result1 = "";
		for (int i = 0; i < 1000; i++) {
			for (char ch = 'A'; ch <= 'z'; ch++) {
				result1 += ch;
			}
			result1 += '\n';
		}
		System.out.println((System.currentTimeMillis()
				- start) / 1000.0 + "초");
		
		long start2 = System.currentTimeMillis();
		StringBuffer result2 = new StringBuffer();
		for (int i = 0; i < 1000; i++) {
			for (char ch = 'A'; ch <= 'z'; ch++) {
				result2.append(ch);
			}
			result1 += '\n';
		}
		System.out.println((System.currentTimeMillis()
				- start2) / 1000.0 + "초");
	}

}
