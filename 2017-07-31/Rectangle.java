public class Rectangle
{
	private int width;
	private int height;
	
	Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	
	public int area()
	{
		return width * height;
	}
}