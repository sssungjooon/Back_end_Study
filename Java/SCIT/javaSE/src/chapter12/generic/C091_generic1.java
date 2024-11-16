package chapter12.generic;

class Coffee {}
class Juice  {}

class BeverageBox {
	private Object[] beverage;
	
	public BeverageBox (Object[ ] beverage) {
		this.beverage = beverage;
	}
	
	public Object getBeverage (int index) {
		return beverage[index];
	}
}

class BeverageBox2<T> {
	private T[] beverage;
	
	public BeverageBox2(T[] beverage) {
		this.beverage = beverage;
	}
	public T getBeverage (int index) {
		return beverage[index];
	}
}

public class C091_generic1 {

	public static void main(String[] args) {
		Coffee[] arr = {
				new Coffee(),
				new Coffee()
		};
		BeverageBox box = new BeverageBox(arr);
		Coffee coffee = (Coffee) box.getBeverage(0);
//		Juice juice = (Juice) box.getBeverage(1); // err 발생 
		
		// 제네릭 사용
		BeverageBox2<Coffee> box2 = new BeverageBox2<Coffee>(arr);
		BeverageBox2<Coffee> box3 = new BeverageBox2<>(arr);
		
		Coffee coffee2 = box2.getBeverage(0);
//		Juice juice2 = box2.getBeverage(1); // 컴파일 err 체크 
	}

}
