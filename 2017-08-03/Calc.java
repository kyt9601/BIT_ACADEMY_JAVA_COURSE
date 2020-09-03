
public abstract class Calc {
	protected int num1;
	protected int num2;
	
	public Calc input(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
		
		return this;
	}
	
	public abstract double calc();
}
