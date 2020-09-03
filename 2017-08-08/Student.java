public class Student implements Comparable<Student>
{
	private String name;
	private Integer no;
	private Integer lang;
	private Integer eng;
	private Integer math;
	
	public Student() {}
	public Student (String name, int no, int lang, int eng, int math)
	{
		this.name = name;
		this.no = no;
		this.lang = lang;
		this.eng = eng;
		this.math = math;
	}
	
	public Integer getTotal() { return lang + eng + math; }
	public Double getAvg() { return getTotal() / (double)3; }
	
	@Override
	public String toString()
	{
		return no + ". " + name + " " + String.join(", ", lang.toString(), eng.toString(), math.toString(),
							getTotal().toString(), getAvg().toString());
	}
	
	@Override
	public int compareTo(Student st)
	{
		return name.compareTo(st.name);
	}
}