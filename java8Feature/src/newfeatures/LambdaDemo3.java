package newfeatures;

//block lambda expressions
public class LambdaDemo3 {

	public static void main(String[] args) {
		
		MyString reverseStr = (str) ->
		{
			String result="";
			for(int i=str.length()-1; i>=0 ; i--)
				result+=str.charAt(i);
			return result;
		};
		
		System.out.println(reverseStr.myStringFunction("Lambda Expressions"));

//		Lambda Expression with single parameter
		MyString myName = (name) ->{ return "Hello " + name;};
		
		System.out.println(myName.myStringFunction("Steve"));
		
//		Lambda Expression with single parameter with no parenthesis
		MyString myName1 = name ->{ return "Hello " + name;};
		
		System.out.println(myName1.myStringFunction("Mathew"));
		
		
	}

}
