package chapter13.collection;

import java.util.HashMap;

public class C105_collection_hashMap1 {

	public static void main(String[] args) {
		HashMap<String, Integer> snack = new HashMap<>();
		snack.put("오징어 땅콩", 2500);
		snack.put("죠리퐁", 1900);
		snack.put("핫브레이크", 450);
		snack.put("빼빼로", 900);
		
		String mySnack = "죠리퐁";
		System.out.println(mySnack + "의 가격은"
				+ snack.get(mySnack) + "원");

	}

}
