package newfeatures;
//Method Reference - shorthand of lambda expressions to call method

@FunctionalInterface
interface MyInterface
{
	void myMethod();
}

class Test //instance class
{
	void display() //instance method
	{
		System.out.println("I'm an Instance Method");
	}
}

public class MethodReferenceDemo1 {

	public static void main(String[] args) {
		
//		traditional approach
		Test t1 = new Test();
		t1.display();
		
//		Java8 Method reference Approach
		MyInterface m1ref = t1::display; //method reference to instance method of an object t1
		
//		calling method of FI
		m1ref.myMethod();
	}

}
