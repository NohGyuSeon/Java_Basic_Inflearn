package lec04.OOP5;

public class MethodDesc {
	
	void printInfo() {
		System.out.println("Hello, world.");
	}
	
	void printInfo(String goodsName) {
		
	}
	
	// 메서드의 반환 타입이 int형이므로 계산된 결과 값의 타입도 int형이 되어야 한다.
	int calculateSum(int quantity, int price) {
		int totalPrice = quantity + price;
		return totalPrice;
	}
	
	int addMaterial(int newInput) {
		// 지역변수는 해당 메서드 내부에서만 사용이 가능하다.
		int remainValue = 0;
		remainValue = remainValue + newInput;
		return remainValue;
	}
	
}
