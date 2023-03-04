package lec04.OOP01.createEntity;

public class HouseTest {

	public static void main(String[] args) {
		
		// House 클래스의 객체를 new 연산자를 통해서 만들고, 
		// House 클래스 타입의 변수 house에 객체의 주소 값을 저장.
		// new 연산자를 통해 객체가 만들어질 때, 해당 객체에 대한 정보는 메모리에 저장되어 있음.
		// 해당 메모리의 주소 값은 변수에 저장되어 있다.
		// 따라서 해당 변수가 알고 있는 메모리 주소로부터 객체에 대한 정보를 가져올 수 있다.
		House house = new House();
		House houseAnother = new House();
		System.out.println("에어컨1 : " + house.airconStat);
		System.out.println("에어컨2 : " + houseAnother.airconStat);
		
		house.airconOn();
		System.out.println("에어컨1 : " + house.airconStat);
		System.out.println("에어컨2 : " + houseAnother.airconStat);
	
		house.airconOff();
		System.out.println("에어컨1 : " + house.airconStat);
		System.out.println("에어컨2 : " + houseAnother.airconStat);
		
	}
	
}
