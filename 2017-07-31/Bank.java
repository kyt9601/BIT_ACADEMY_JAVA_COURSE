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
			System.out.println("1.���� | 2.��� | 3.��� | 4.����");
			System.out.println("----------------------------");
			System.out.print("���� > ");
			
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
		
		System.out.print("���ݾ� > ");
		iTmp = sc.nextInt();
		
		if (iTmp < 0)
			System.out.println("���� �Ұ�");
		else
			iBalance += iTmp;	
	}
	
	private void withdraw()
	{
		Integer iTmp;
		
		System.out.print("��ݾ� > ");
		iTmp = sc.nextInt();
		
		if (iTmp < 0)
			System.out.println("��� �Ұ�");
		else if (iTmp <= iBalance)
			iBalance -= iTmp;
		else
			System.out.println("�ѵ� �ʰ�");
	}
	
	private void print()
	{
		System.out.println("������ : " + sName);
		System.out.print("���¹�ȣ : ");
		
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
		
		System.out.println("�ܾ� : " + iBalance);
	}
	
	private Boolean exit()
	{
		System.out.println("");
		System.out.println("���α׷� ����");
		
		return false;
	}
}