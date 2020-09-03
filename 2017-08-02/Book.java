
 public class Book {
	protected String title;
	protected int pages;
	protected String writer;
	
	public Book(String title, int pages, String writer)
	{
		this.title = title;
		this.pages = pages;
		this.writer = writer;
	}
	
	public String getTitle() { return title; }
	public int getPages() { return pages; }
	public String getWriter() { return writer; }
	public void setTitle(String title) { this.title = title; }
	public void setPages(int pages) { this.pages = pages; }
	public void setWriter(String writer) { this.writer = writer; }
}
