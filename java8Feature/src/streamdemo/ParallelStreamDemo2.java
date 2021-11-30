package streamdemo;

import java.util.ArrayList;
import java.util.List;

// Java Program to count Employee who's salary is greater than 15000
// in Quick fashion
public class ParallelStreamDemo2 {

	public static void main(String[] args) {
		
		List < Employee > empList = new ArrayList < Employee > ();
		for (int i = 0; i < 100; i++) {
		empList.add(new Employee("Allen", 20000)); // new keyword bcoz Employee is a constructor and we are passing value to the constructor
		empList.add(new Employee("Boon", 3000));
		empList.add(new Employee("Cavin", 15002));
		empList.add(new Employee("Duke", 7856));
		empList.add(new Employee("Eon", 200));
		empList.add(new Employee("Fred", 50000));
		}
		
		empList.stream().forEach(i -> System.out.println(i.getName() + " "+ i.getSalary()));
		
//		System.out.println("Number of Employees whose salary is greater than 15k");
		
		long t1 = System.currentTimeMillis();
		System.out.println();
		
//		SEQUENTIAL
		
		System.out.println("Count of Employees using Sequential Stream: " + empList.stream().filter(e -> e.getSalary() >25000).count());
		long t2 = System.currentTimeMillis();
		System.out.println("Time Tsken by Sequential Stream to count Employees: "+ (t2-t1));
		
		System.out.println("**********************************************************************");
		
//		PARALLEL
		
		long t3 = System.currentTimeMillis();
		System.out.println("Count of Employees using Parallel Stream: " + empList.parallelStream().filter(e -> e.getSalary() >25000).count());
		long t4 = System.currentTimeMillis();
		System.out.println("Time Tsken by Parallel Stream to count Employees: "+ (t4-t3));
		
		
	}

}
