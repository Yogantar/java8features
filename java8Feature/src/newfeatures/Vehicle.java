package newfeatures;

public interface Vehicle {
	
//	different for different vehicle so abstract
//	By default all are abstract methods even without giving keyword
	String getBrand();
	String speedUp();
	String slowDown();
	
// it can be common for different vehicles so default
//	Any non abstract method must be made default to add any new feature
	default String turnAlarmOn()
	{
		return "Turning the Vehicle Alarm ON.";
	}
	
	default String turnAlarmOff()
	{
		return "Turning the Vehicle Alarm OFF.";
	}

	static int getHorsePower(int rpm,int torque)
	{
		return (rpm*torque)/5252;
	}
}
