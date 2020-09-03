
public class Magazine extends Book{
	private String mName;
	private String date;
	
	public Magazine(String title, int pages, String writer, String mName, String date)
	{
		super(title,pages,writer);
		this.mName = mName;
		this.date = date;
	}
	
	public String getMName() { return mName; }
	public String getDate() { return date; }
	public void setMName(String mName) { this.mName = mName; }
	public void setDate(String date) { this.date = date; }
}
