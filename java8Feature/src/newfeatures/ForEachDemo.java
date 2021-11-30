package newfeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/*
 * forEach() Method In Iterable Interface
Java 8 has introduced a “forEach” method in the interface java.lang.Iterable 
that can iterate over the elements in the collection. “forEach” is a default 
method defined in the Iterable interface.
 It is used by the Collection classes that extend the Iterable interface to iterate elements.

The “forEach” method takes the Functional Interface as a single parameter i.e. you can pass Lambda Expression as an argument.
 */

public class ForEachDemo {

	public static void main(String[] args) {
		
		List<String> languages = new ArrayList<String>(); //declare ArrayList
		
		//Add element to List
		languages.add("Java");
		languages.add("Python");
		languages.add("C#");
		languages.add("Scala");
		languages.add("Ruby");
		languages.add("C++");
		
//		Displaying the values of List
		System.out.println("*********** Programming Languages ************");
		languages.forEach(i -> System.out.println(i));
		
		System.out.println("*********Print Elements using Method Reference**********");
		languages.forEach(System.out::println);
		
//		-> expression is anonymous function basically
//		anything left of lambda operator is input parameter ( i )
//		anything on right is method body (system.out.println)

		Map<Integer, String> customer = new HashMap<Integer, String>();
//		Map is used to store the data in key-value pairs
// 		.put is used to add values in case of map		
		customer.put(101,"Adam");
		customer.put(102,"Steve");
		customer.put(103,"Eve");
		customer.put(104,"Derek");
		customer.put(105,"James");
		
//		Displaying the values of Map	
		System.out.println("******** Customer Account No. and Names **********");
		customer.forEach((k,v) -> System.out.println("Key: " + k + "  Value: " + v));
	 
		ArrayList<Integer> arrL = new ArrayList<Integer>();
		arrL.add(10);
		arrL.add(12);
		arrL.add(3);
		arrL.add(40);
		
//		to sort predefined object
		Collections.sort(arrL);
		
//		use lambda expression to display ArrayList
		System.out.println("*********ArrayList Contents**********");
		arrL.forEach(i -> System.out.println(i));
		
//		use lambda expression to print even no. in ArrayList
		System.out.println("***********Even Numbers in ArrayList***********");
		arrL.forEach(n -> { if(n%2==0) System.out.println(n);});
		
		
	}
	
	
}
