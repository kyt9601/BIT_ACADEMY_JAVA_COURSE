import java.util.Scanner;

public class WhileExample
{
	public static void main(String[] args)
	{
		/*int num = 1;
		int sum = 0;
		
		while (num <= 100)
		{
			if (num%2 == 0) { sum += num; }
			num++;
		}
		
		System.out.println("�� : " + sum);*/
		
		int num = 0;
		Scanner sc = new Scanner(System.in);

		while ((num = sc.nextInt()) != 0)
			if (num%2 == 0)
				System.out.println("¦���Դϴ�.");
			else
				System.out.println("Ȧ���Դϴ�.");
		
		sc.close();
	}
}