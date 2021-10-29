package basic;

public class Lamp2
{
	boolean isOn;

	public void turnOn(String bulb)
	{
		isOn = true;
		System.out.print("Class Lamp2: ");
		System.out.println(bulb + " on? " + isOn);
	}

	public void turnOff(String bulb)
	{
		isOn = false;
		System.out.print("Class Lamp2: ");
		System.out.println(bulb + " on? " + isOn);
	}

	public static void main(String args[])
	{
		Lamp led = new Lamp();
		Lamp2 halogen = new Lamp2();

		led.turnOn("Led");

		halogen.turnOff("Halogen");
	}
}