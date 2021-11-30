package streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample5 {

	public static void main(String[] args) {
//		Iteration using .iterate --> used to define infinite sequential stream

		Stream<Integer> evenInfiniteStream = Stream.iterate(0, n -> n+2);
//		Limit function
//		Converting stream to List
		List<Integer> evenList = evenInfiniteStream.limit(10).collect(Collectors.toList());
		
		System.out.println("Even Numbers with limit 10: ");
		System.out.println(evenList);
		
		System.out.println("***********************************");
		
		Stream<Integer> oddInfiniteStream = Stream.iterate(1, n -> n+2);
//		Limit function	
//		Converting stream to set
		Set<Integer> oddList = oddInfiniteStream.limit(10).collect(Collectors.toSet());
		
		System.out.println("Set of Odd Numbers with limit 10: ");
		System.out.println(oddList);
		
//		Distinct - filter unique elements
		List<String> desig = Arrays.asList("Manager","Technician","Salesman","Developer","Manager");
		List<String> distinctDesig = desig.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctDesig);

//		skip() -- used to skip first n elements
		Stream<Integer> evenInfiniteStream1 = Stream.iterate(0, n -> n+2);

		List<Integer> evenList1 = evenInfiniteStream1.skip(5).limit(10).collect(Collectors.toList());
		
		System.out.println("Even Numbers after skipping first five elements with limit 10: ");
		System.out.println(evenList1);
		
//		anyMatch() -
		boolean match = desig.stream().anyMatch(s -> s.contains("Developer"));
		System.out.println("Developer Exists or not: "+match);
		
		
		
	}
	
}
