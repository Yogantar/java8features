package newfeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Java lambda expression can be used in the collection framework.
 * It provides efficient and concise way to iterate, filter and fetch data.
 */
public class LambdaComparatorDemo {

	public static void main(String[] args) {

		Student s1 = new Student(101,"Steve",89);
		Student s2 = new Student(102,"Tom",79);
		Student s3 = new Student(103,"Dave",86);
		Student s4 = new Student(104,"Peter",92);
		Student s5 = new Student(105,"Eric",80);
		
//		Add Student to ArrayList
		List<Student> sList = new ArrayList<Student>();
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		sList.add(s4);
		sList.add(s5);
		
		System.out.println("Sort Student based on Names: " );
		
//		implementing Lambda Expression to sort user defined objects 
//		using Comparator interface compareTo() method
		
		Collections.sort(sList,(st1,st2) -> {
			return st1.name.compareTo(st2.name);
		});
		
//		Using enhanced for loop
		for(Student s: sList)
		{
			System.out.println(s.rollNumber + " " + s.name + " " + s.marks);
		}
		
//		Sort in descending order based on the marks of a student
		System.out.println("********Descending order based on Marks***********");
		
		Collections.sort(sList,(st1,st2) -> {
			return st2.marks.compareTo(st1.marks);
		});
		
//		Using forEach loop
		sList.forEach(s -> System.out.println(s.rollNumber + " " + s.name + " " + s.marks));
	}
	
	
	

}
