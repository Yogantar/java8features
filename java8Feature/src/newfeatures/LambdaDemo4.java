package newfeatures;

// Perform Arithmetic operations using Lambda
public class LambdaDemo4 {

	public static void main(String[] args) {
		
		Addition op1 = (a,b) -> (a+b);
		System.out.println("Addition of 2 numbers: " + op1.calculate(10, 20));
		
		Addition op2 = (a,b) -> (a-b);
		System.out.println("Subtraction of 2 numbers: " + op2.calculate(10, 20));
	
		Addition op3 = (a,b) -> (a*b);
		System.out.println("Multiplication of 2 numbers: " + op3.calculate(10, 20));

		Addition op4 = (int a,int b) -> (a/b);
		System.out.println("Division of 2 numbers: " + op4.calculate(40, 20));
	
	}

}
