package newfeatures;

public class Student {

	Integer rollNumber;
	String name;
	Double marks;
	
	
	public Student(int rollNumber, String name, double marks) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public Integer getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public Double getMarks() {
		return marks;
	}




}
