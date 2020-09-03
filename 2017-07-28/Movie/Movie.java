package Movie;

public class Movie
{
	private int year;
	private String title;
	
	Movie(int year, String title)
	{
		this.year = year;
		this.title = title;
	}
	
	public void print()
	{
		System.out.println(year + " : " + title);
	}
}