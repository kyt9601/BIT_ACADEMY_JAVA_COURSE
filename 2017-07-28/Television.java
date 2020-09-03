public class Television
{
	private int inch;
	private int channel;
	private String model;
	private String brand;
	
	public Television(int inch, String model, String brand)
	{
		this.inch = inch;
		this.channel = 8;
		this.model = model;
		this.brand = brand;
	}
	
	public void channelUp() { channel++; }
	public void channelDown() { channel--; }
	
	public void print()
	{
		System.out.println("inch : " + inch);
		System.out.println("channel : " + channel);
		System.out.println("model : " + model);
		System.out.println("brand: " + brand);
	}
}