import java.util.Scanner;

public class Exercise06
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i, j;
		int n = sc.nextInt();
		
		for (i=0; i<n; i++)
		{
			for (j=0; j<=i; j++)
				System.out.print("*");
			System.out.println("");
		}
		
		for (i-=2; 0<=i; i--)
		{
			for (j=0; j<=i; j++)
				System.out.print("*");
			System.out.println("");
		}
		
		sc.close();
	}
}