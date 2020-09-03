public class TelevisionExample
{
	public static void main(String[] args)
	{
		Television tv = new Television(49,"SM-498","Samsung");
		
		tv.print();
		
		tv.channelUp();
		tv.channelUp();
		tv.print();
		
		tv.channelDown();
		tv.print();
	}
}