
public class Member {
	private String name;
	private String phoneNo;
	
	Member()
	{
		this("","");
	}
	
	Member(String name, String phoneNo)
	{
		this.name = name;
		this.phoneNo = phoneNo;
	}
	
	public String getName() { return name; }
	public String getPhoneNo() { return phoneNo; }
	public void setName(String name) { this.name = name; }
	public void setPhoneNo(String phoneNo) { this.phoneNo = phoneNo; }
}
