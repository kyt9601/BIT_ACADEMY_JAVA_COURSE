public class Lamp
{
	Boolean isOn = false;
	
	public void turnOnOff()
	{
		if (isOn)
			isOn = false;
		else
			isOn = true;
	}
	
	public void print()
	{
		System.out.println("현재 램프가 " + (isOn?"켜":"꺼") +"져 있습니다.");
	}
}