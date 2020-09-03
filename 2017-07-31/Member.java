public class Member
{
	private String sName;
	private String sId;
	private String sPassword;
	private Integer iage;
	
	public Member(String sName, String sId)
	{
		this.sName = sName;
		this.sId = sId;
		this.sPassword = "";
		this.iage = 0;
	}
}