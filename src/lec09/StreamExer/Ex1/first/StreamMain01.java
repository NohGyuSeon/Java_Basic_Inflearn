package lec09.StreamExer.Ex1.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain01 {

	public static void main(String[] args) {
		List<String> strList01 = new ArrayList<String>();
		strList01.add("반도체");
		strList01.add("가전제품");
		strList01.add("휴대폰");
		strList01.add("자동차");
		strList01.add("배");

		strList01.stream().sorted().forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		String[] strArray = new String[] {"Alpha", "Brabo", "Charlie", "Delta"};

		List<String> cvtStrList = Arrays.asList(strArray);
		cvtStrList.stream().forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		Stream<String> cvtStream01 = Arrays.stream(strArray);
		cvtStream01.forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		Stream<String> cvtStream02 = Arrays.stream(strArray, 2, 3);
		cvtStream02.forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		Stream<String> cvtStream03 = Stream.of(strArray);
		cvtStream03.forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		System.out.println("========================================");
		
		Stream<String> streamCompany = Stream.of("Samsung", "LG", "Hyundai", "SK");
		streamCompany.forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		Stream<String> streamCountry = 
				Stream.of("korea", "America", "Japan", "China", "Russia");
		streamCountry.forEach(i -> System.out.println(i + " "));
		System.out.println();
		
		IntStream intStream01 = IntStream.range(1, 7);
		intStream01.forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		IntStream intStream02 = IntStream.rangeClosed(1, 7);
		intStream02.forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		IntStream intsRandom01 = new Random().ints();
		intsRandom01.limit(5).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		IntStream intsRandom02 = new Random().ints(2);
		intsRandom02.forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		System.out.println("========================================");

		DoubleStream doublesRandom01 = new Random().doubles();
		 
		
		
				
	}
}
