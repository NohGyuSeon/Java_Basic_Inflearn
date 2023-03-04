package lec04.OOP01.createEntity;

public class House {

	// 속성(인스턴스 변수)
	public String airconStat = "off";
	public String heatStat = "off";
	public String doorStat = "close";
	
	// 기능(메서드)
	public void airconOn() {
		// 기능(메서드) 내의 속성(지역 변수)
		airconStat = "on";
	}
	
	// 기능(메서드)
	public void airconOff() {
		// 기능(메서드) 내의 속성(지역 변수)
		airconStat = "off";
	}
	
}
