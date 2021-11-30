package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {
		Integer[] marks = {45,46,57,84,85,26};
		
//		Build Stream from Arrays
		Stream<Integer> strm = Stream.of(marks);
		strm.forEach(i -> System.out.println(i));
//		strm.forEach(System.out::println);
		

		
		List<Integer> grades = new ArrayList<Integer>();
		grades.add(10);
		grades.add(6);
		grades.add(8);
		grades.add(4);
		grades.add(9);
		grades.add(5);
		
//		Build Stream from Collections
		Stream<Integer> strm1 = grades.stream();
		System.out.println("***********ArrayList Content ***************");
		strm1.forEach(System.out::println);
		
		List<Integer> squares = grades.stream().map(m -> m*m).collect(Collectors.toList());
		
		System.out.println("******Square of ArrayList Content*******");
		System.out.println(squares);
	}

}
