package lec04.OOP6.arrayparameter;

public class ParamArray {
	
	// 메서드의 배열 파라미터 이용
	public void prinInfoParamArray(String[] strParamArray) {
		for (String strParam : strParamArray) {
			System.out.println("strParam : " + strParam);
		}
	}
	
}
