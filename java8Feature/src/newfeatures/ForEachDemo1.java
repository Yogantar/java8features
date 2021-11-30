package newfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Creating Consumer action
//consumer is an interface which is already defined in util package
public class ForEachDemo1 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Mike","John","Alex");//short form of arraylist
//		creating action for consumer
		Consumer<String> convertUpperCase = new Consumer<String>()
				{

					@Override
					public void accept(String t) {
						System.out.println(t.toUpperCase());
					}
				
				};
				
//				traversing through consumer interface implementation
				names.forEach(convertUpperCase);
				
//				Consumer to display a number
				Consumer<Integer> display = a -> System.out.println(a);
				
//				Implement display using accept
				display.accept(10);
	}
	
}
