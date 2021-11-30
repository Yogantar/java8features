package newfeatures;

@FunctionalInterface
interface MyFI
{
	public String sayHello(); //Abstract Method
}

public class LambdaDemo1 {

	public static void main(String[] args) {

		MyFI msg = () -> {return "Hello World";}; 
		//lambda expression cannot be executed by itself and needs instance of FI
//		msg is an instance of MyFI 
		System.out.println(msg.sayHello());
	}

}
