package lec04.OOP4;

public class MethodCallTest {

	public static void main(String[] args) {
		
		int sumRtn = sumLogic(1, 2);
		System.out.println("sumRtn : " + sumRtn);
		
		AnotherClassUseMethodCallTest.sayHello();
		
		AnotherClassUseMethodCallTest acmt = new AnotherClassUseMethodCallTest()	;
		acmt.sayRoger();
	} 
	
	public static int sumLogic(int one, int two) {
		int sum = one + two;
		return sum;
	}
	
}
