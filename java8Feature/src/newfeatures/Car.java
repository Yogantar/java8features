package newfeatures;

public class Car implements Vehicle {

	
	private String brand;
	
	Car(String brand)
	{
		this.brand = brand;
	}
	@Override
	public String getBrand() {
		return brand;
	}

	@Override
	public String speedUp() {
		return "Vehicle is Speeding Up !!! ";
	}

	@Override
	public String slowDown() {
		return "Vehicle is Slowing Down !!! ";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
