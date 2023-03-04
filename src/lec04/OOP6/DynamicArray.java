package lec04.OOP6;

import java.util.Arrays;

public class DynamicArray {

	// 메서드의 동적 파라미터 이용
	public void dynamicMethod(String... msgParameter) {
		String[] strArray = msgParameter;
		System.out.println(Arrays.toString(strArray));
	}

}
