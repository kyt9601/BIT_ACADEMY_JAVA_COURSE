import java.util.Scanner;

public class DoWhileExample
{
	public static void main(String[] args)
	{
		Scanner sc  = new Scanner(System.in);
		String inputString;
		
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q 를 입력하세요.");
		
		do
		{
			System.out.print("> ");
			System.out.println( (inputString = sc.nextLine()) );
		}
		while (!inputString.equals("q"));
		
		System.out.println(System.lineSeparator() + "프로그램 종료");
		
		sc.close();
	}
}