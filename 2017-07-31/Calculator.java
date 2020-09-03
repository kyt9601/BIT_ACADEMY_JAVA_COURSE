public class Calculator
{
	private Boolean bPower;
	
	public Calculator()
	{
		bPower = false;
	}
	
	public void power()
	{
		if (bPower)
		{
			bPower = false;
			System.out.println("전원을 끕니다");
		}
		else
		{
			bPower = true;
			System.out.println("전원을 켭니다");
		}
	}
	
	public Integer add(Integer x, Integer y)
	{ return x + y; }
	
	public Integer sub(Integer x, Integer y)
	{ return x - y; }
	
	public Integer multiply(Integer x, Integer y)
	{ return x * y; }
	
	public Double divide(Integer x, Integer y)
	{ return (double)x / y; }
}