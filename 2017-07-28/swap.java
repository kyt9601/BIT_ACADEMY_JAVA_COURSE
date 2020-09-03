public class swap
{
	public static void main(String[] args)
	{
		Integer x = 5;
		Integer y = 4;
		
		System.out.println("x : " + x + ", y : " + y);
		Swap(x,y);
		System.out.println("x : " + x + ", y : " + y);
	}
	
	public static void Swap(Integer x, Integer y)
	{
		Integer tmp = x;
		x = y;
		y = tmp;
	}
}