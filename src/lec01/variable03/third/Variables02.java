package lec01.variable03.third;

import java.util.Date;

public class Variables02 {

	public static void main(String[] args) {
		
		SampleVO01 sample1 = new SampleVO01();
		
		sample1.sampleBoolean = true;
		sample1.sampleChar = '가';
		sample1.sampleString = "한글";
		sample1.sampleByte = 1;
		sample1.sampleShort = 10;
		sample1.sampleInt = 100;
		sample1.sampleLong = 1000;
		sample1.sampleFloat = 1.1f;
		sample1.sampleDouble = 1.2345;
		
		System.out.println("boolean : " + sample1.sampleBoolean);
		System.out.println("boolean : " + sample1.sampleChar);
		System.out.println("boolean : " + sample1.sampleString);
		System.out.println("boolean : " + sample1.sampleByte);
		System.out.println("boolean : " + sample1.sampleShort);
		System.out.println("boolean : " + sample1.sampleInt);
		System.out.println("boolean : " + sample1.sampleLong);
		System.out.println("boolean : " + sample1.sampleFloat);
		System.out.println("boolean : " + sample1.sampleDouble);
		
		Date date = new Date();
		System.out.println("date : " + date);
	}
	
}
