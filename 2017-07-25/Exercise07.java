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
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("----------------------------");
			System.out.print("���� > ");
			
			switch(sc.nextInt())
			{
			case 1 :
				System.out.print("���ݾ� > ");
				iTmp = sc.nextInt();
				
				if (iTmp < 0)
					System.out.println("���� �Ұ�");
				else
					iBalance += iTmp;
			break;
			case 2 :
				System.out.print("��ݾ� > ");
				iTmp = sc.nextInt();
				
				if (iTmp < 0)
					System.out.println("��� �Ұ�");
				else if (iTmp <= iBalance)
					iBalance -= iTmp;
				else
					System.out.println("�ѵ� �ʰ�");
			break;
			case 3 :
				System.out.println("�ܰ� > " + iBalance);
			break;
			case 4 :
				bRun = false;
			break;
			}
		}

		System.out.println("���α׷� ����");
		sc.close();
	}
}