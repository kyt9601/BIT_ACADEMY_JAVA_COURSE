import java.util.Scanner;


public class Bank
{
	private String sName;
	private String sAccountNumber;
	private Integer iBalance;
	private Scanner sc;
	
	public Bank(String sName)
	{
		this.sName = sName;
		iBalance = 0;
		sc = new Scanner(System.in);
		
		sAccountNumber = "";
		for (int i=0; i<16; i++)
			sAccountNumber += (int)(Math.random() * 10);
		
		print();
	}
	
	public void run()
	{
		Boolean bRun = true;
		
		while (bRun)
		{
			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.출력 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택 > ");
			
			switch(sc.nextInt())
			{
			case 1 :
				deposit();
			break;
			case 2 :
				withdraw();
			break;
			case 3 :
				print();
			break;
			case 4 :
				bRun = exit();
			break;
			}
		}
	}
	
	private void deposit()
	{
		Integer iTmp;
		
		System.out.print("예금액 > ");
		iTmp = sc.nextInt();
		
		if (iTmp < 0)
			System.out.println("예금 불가");
		else
			iBalance += iTmp;	
	}
	
	private void withdraw()
	{
		Integer iTmp;
		
		System.out.print("출금액 > ");
		iTmp = sc.nextInt();
		
		if (iTmp < 0)
			System.out.println("출금 불가");
		else if (iTmp <= iBalance)
			iBalance -= iTmp;
		else
			System.out.println("한도 초과");
	}
	
	private void print()
	{
		System.out.println("예금주 : " + sName);
		System.out.print("계좌번호 : ");
		
		int idx;
		for (idx=0; idx<7; idx++)
			System.out.print(sAccountNumber.charAt(idx));
		System.out.print("-");
		for (idx=idx; idx<9; idx++)
			System.out.print(sAccountNumber.charAt(idx));
		System.out.print("-");
		for (idx=idx; idx<16; idx++)
			System.out.print(sAccountNumber.charAt(idx));
		System.out.println("");
		
		System.out.println("잔액 : " + iBalance);
	}
	
	private Boolean exit()
	{
		System.out.println("");
		System.out.println("프로그램 종료");
		
		return false;
	}
}