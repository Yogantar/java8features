package newfeatures;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		/*String s = null;
		Integer a = null; //it uses wrapper class
		System.out.println(s.length()); // throws Null Pointer Exception
		*/
		
		String s = null;
//		String s = "Hello there";
//		Optional object is a container for not null objects
		Optional<String> chkNull = Optional.ofNullable(s);
		
		if(chkNull.isPresent())
		{
			System.out.println("Length of String is: "+ s.length());
			chkNull.ifPresent(System.out::println);
			System.out.println(s.toUpperCase());
			System.out.println(chkNull.get());
		}
		else
		{
			System.out.println("String is not Present");
		}
	}

}
