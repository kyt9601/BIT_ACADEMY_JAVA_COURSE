public class Account
{
	private String no;
	private String owner;
	private int balance;
	
	public Account(String no, String owner, int balance)
	{
		this.no = no;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getNo() { return no; }
	public String getOwner() { return owner; }
	public int getBalance() { return balance; }
	public void setNo(String no) { this.no = no; }
	public void setOwner(String owner) { this.owner = owner; }
	public void setBalance(int balance) { this.balance = balance; }
}