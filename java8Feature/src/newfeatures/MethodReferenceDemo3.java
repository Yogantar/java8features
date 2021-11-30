package newfeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReferenceDemo3 {

	public static void main(String[] args) {

		Order ord1 = new Order(1000,"GOOG.LE",12000.10,Order.Side.BUY);
		Order ord2 = new Order(500,"GM.TS",5000.30,Order.Side.SELL);
		Order ord3 = new Order(750,"GM.TS",4000.30,Order.Side.BUY);
		
		List<Order> orderBook = new ArrayList<Order>();
		
		orderBook.add(ord1);
		orderBook.add(ord2);
		orderBook.add(ord3);
	
//		sort all orders based on quantity using Lambda
		System.out.println("Before Sorting: " + orderBook); // invokes toString() method
		
		Collections.sort(orderBook,(a,b) -> Order.compareByQuantity(a, b));
		System.out.println("After Sorting: " + orderBook);
		
//		sort all orders based on quantity using Method Reference by calling static method
		Collections.sort(orderBook,Order::compareByQuantity);
		System.out.println("After Sorting: " + orderBook);
		
//		sort all orders based on price using Method Reference by calling instance method
		Order order = orderBook.get(0); // we require reference of object
		Collections.sort(orderBook,order::compareByPrice);
		System.out.println("After Sorting by Price: " + orderBook);

//		Method reference example for Arbitrary Object of a particular type
		String[] symbols = {"GOOGLE","Yahoo","BING","amazon"};
		Arrays.sort(symbols,String::compareToIgnoreCase);
		
		for(String i: symbols)
		System.out.println(i);

	}

}
