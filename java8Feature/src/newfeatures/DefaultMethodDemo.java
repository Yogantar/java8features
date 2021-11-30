package newfeatures;

public class DefaultMethodDemo {

	public static void main(String[] args) {
		
//		invoke overridden method(abstract)
		Vehicle car = new Car("BMW");
		System.out.println(car.getBrand());
		System.out.println(car.speedUp());
		System.out.println(car.slowDown());
		
//		invoke default methods
		System.out.println(car.turnAlarmOn());
		System.out.println(car.turnAlarmOff());
		
//		invoke static method
		System.out.println(Vehicle.getHorsePower(2500, 400));//static methods are invoked using interface name
	}

}
