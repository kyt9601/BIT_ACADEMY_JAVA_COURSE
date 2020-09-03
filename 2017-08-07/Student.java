public class Student
{
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name)
	{
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode()
	{
		return studentNum + name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof Student)
		{
			Student st = (Student)obj;
			return st.name.equals(name) && (st.studentNum == studentNum);
		}
		else
		{
			return false;
		}
	}
}