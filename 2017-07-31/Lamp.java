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
		System.out.println("���� ������ " + (isOn?"��":"��") +"�� �ֽ��ϴ�.");
	}
}