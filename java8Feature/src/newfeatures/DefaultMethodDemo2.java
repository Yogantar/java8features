package newfeatures;

import java.time.LocalDate;

//Java8 allows to add functionality to interfaces i.e. non abstract methods
interface Parser{
	default void parse(){
		System.out.println("default Parsing logic");
	} 
	
	static void displayDate()
	{
		System.out.println(LocalDate.now());
	}
}

class TextParser implements Parser
{
//	inherit default implementation of Parse
}

class XMLParser implements Parser
{
//	Overridden method
	public void parse(){
		System.out.println("Parsing XML Files");
	} 
}
public class DefaultMethodDemo2 {

	public static void main(String[] args) {
//		creating instance of interface and doing upcasting
		Parser p = new TextParser();  	// references child class TextParser
		p.parse(); 				   		// invoke default method in interface
		
//		using the same instance to call another class
		p = new XMLParser(); 			//  references child class XMLParser
		p.parse(); 						// invoke overridden method in XMLParser class
		
		System.out.println("Program Executed on: ");
		Parser.displayDate();  //invoke Static method
	}

}
