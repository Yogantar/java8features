package newfeatures;
// Program to demonstrate Method Reference to an instance method of a class

@FunctionalInterface
interface IDemo
{
	void sum(int x, int y);
}

class Calculation
{
	void addition(int a, int b)
	{
		System.out.println("The Addition is(by method reference): " + (a+b));
	}
}
public class MethodReferenceDemo2 {

	public static void main(String[] args) {
		
		Calculation c1 = new Calculation();
		
//		using Lambda Expressions
		IDemo d1 = (a,b) -> System.out.println("The Addition is: " + (a+b));
		d1.sum(40, 30);
		
//		using Method Reference
		IDemo d2 = c1::addition;
		d2.sum(200, 140);
	}

}
