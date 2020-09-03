import java.util.Scanner;

public class Exercise07
{
	public static void main(String[] args)
	{
		Boolean bRun = true;
		Integer iBalance = 0;
		Scanner sc = new Scanner(System.in);
		
		while (bRun)
		{
			Integer iTmp;
			
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택 > ");
			
			switch(sc.nextInt())
			{
			case 1 :
				System.out.print("예금액 > ");
				iTmp = sc.nextInt();
				
				if (iTmp < 0)
					System.out.println("예금 불가");
				else
					iBalance += iTmp;
			break;
			case 2 :
				System.out.print("출금액 > ");
				iTmp = sc.nextInt();
				
				if (iTmp < 0)
					System.out.println("출금 불가");
				else if (iTmp <= iBalance)
					iBalance -= iTmp;
				else
					System.out.println("한도 초과");
			break;
			case 3 :
				System.out.println("잔고 > " + iBalance);
			break;
			case 4 :
				bRun = false;
			break;
			}
		}

		System.out.println("프로그램 종료");
		sc.close();
	}
}