
public abstract class Phone {
	public String owner;
	
	public Phone(String owner)
	{
		this.owner = owner;
	}
	
	public void turnOn()
	{
		System.out.println("ÄÕ´Ï´Ù");
	}
	
	public void turnOff()
	{
		System.out.println("²ü´Ï´Ù");
	}
}
