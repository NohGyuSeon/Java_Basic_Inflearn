package lec01.calculator04.seventh;

public class Calc07 {
	
	public static void main(String[] args) {
		
		double calcData1 = (1.0 + 2.0) / 2.0;
		double calcData2 = 1.0 + (2.0 / 2.0);
		
		System.out.println("calcData1 : " + calcData1);
		System.out.println("calcData2 : " + calcData2);
		
		calcData1 = 1 + 2 / 3 - 4 * 5;
		calcData2 = 1 + 2 / 3 - 4 * 5;
		double calcData3 = 1 + 2 / 3 - 4 * 5;
		
		System.out.println("calcData1 : " + calcData1);
		System.out.println("calcData1 : " + calcData2);
		System.out.println("calcData1 : " + calcData3);
		
		calcData1 = (1 + 2) / (3 - 4) * 5;
		calcData2 = 1 + (2 / 3) - 4 * 5;
		calcData3 = 1 + 2 / ((3 - 4) * 5);
		
		System.out.println("괄호 묶고 calcData1 : " + calcData1);;
		System.out.println("괄호 묶고 calcData2 : " + calcData2);;
		System.out.println("괄호 묶고 calcData3 : " + calcData3);;
		
		calcData1 = 1 + 2;
		calcData1 = calcData1 / 3;
		System.out.println("계산 calcData1 : " + calcData1);
	}
	
}
