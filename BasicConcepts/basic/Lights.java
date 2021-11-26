package basic;

class Lamp
{
	boolean isOn;

	void turnOn(String bulb)
	{
		isOn = true;
		System.out.print("Class Lamp: ");
		System.out.println(bulb + " on? " + isOn);
	}

	void turnOff(String bulb)
	{
		isOn = false;
		System.out.print("Class Lamp: ");
		System.out.println(bulb + " on? " + isOn);
	}
}

public class Lights
{
	public static void main(String args[])
	{
		Lamp led = new Lamp();
		Lamp halogen = new Lamp();

		led.turnOn("Led");

		halogen.turnOff("Halogen");
	}
}