import java.util.Scanner;

public class Rotto
{
	public static void main(String[] args)
	{
		int n;
		int counter = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("발권 개수 : ");
		n = sc.nextInt();
		
		while (true)
		{
			System.out.println("--- " + counter++ + "회차 ---");
			
			for (int i=0; i<6; i++)
				System.out.print(Random.rand(1,46) + " ");
			
			System.out.println(System.lineSeparator());
			
			if (n < counter) { break; }
		}
		
		sc.close();
	}
}