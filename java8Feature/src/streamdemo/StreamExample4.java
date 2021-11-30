package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Java program to filter Collection of user defined objects using Stream
public class StreamExample4 {

	public static void main(String[] args) {
		
		//Creating list of Books which is user defined collection
		List<Book> list=new ArrayList<Book>();

		//Creating Books
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);
		Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
		Book b4=new Book(104,"Java Programming","James","Mosby",16);
		Book b5=new Book(105,"Spring Framework","Ross","Geller",9);

		
		//Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		
		List<Integer> list1 = list.stream().filter(i -> i.quantity >7).map(i -> i.quantity).collect(Collectors.toList());
//		.filter is used to filter the data, .map is used to fetch quantity
		System.out.println("Books with quantity more than 7");
		System.out.println(list1);
		
//		Displaying as collection(List)
		System.out.println("Book Names with quantity more than 7 (using List): ");
		List<String> list2 = list.stream().filter(i -> i.quantity >7).map(i -> i.name).collect(Collectors.toList());
		System.out.println(list2);
		
		System.out.println("Book Details with quantity more than 7: ");
		list.stream().filter(i -> i.quantity >7).forEach(i -> System.out.println("Id: "+i.id + " Name: " +i.name+ " Author: "+ i.author+ " Publisher: "+ i.publisher+ " Quantity: "+ i.quantity));
		
//		reduce method
		int totalQty = list.stream().map(i-> i.quantity).reduce(0, (sum,qty) -> sum+qty); // sum = sum+qty
		System.out.println("Total Quantity of Books: "+ totalQty);
		
//		Max & Min method()
		Book bk1 = list.stream().max((book1,book2) ->book1.quantity > book2.quantity ? 1:-1).get();
		System.out.println("Maximum Quantity of Books: "+ bk1.quantity + " || "+ b1.name);
		
		Book bk2 = list.stream().min((book1,book2) ->book1.quantity > book2.quantity ? 1:-1).get();
		System.out.println("Minimum Quantity of Books: "+ bk2.quantity+ " || "+ bk2.name);
		
//		count()
		
		long count = list.stream().count();
		System.out.println("Total Categories of Books: " + count);
		
		long count1 = list.stream().filter(i-> i.quantity <7).count();
		System.out.println("Total Books with quantity less than 7: "+count1);
		
		
	}

}
