import java.util.Scanner;

public class DoWhileExample
{
	public static void main(String[] args)
	{
		Scanner sc  = new Scanner(System.in);
		String inputString;
		
		System.out.println("�޽����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� q �� �Է��ϼ���.");
		
		do
		{
			System.out.print("> ");
			System.out.println( (inputString = sc.nextLine()) );
		}
		while (!inputString.equals("q"));
		
		System.out.println(System.lineSeparator() + "���α׷� ����");
		
		sc.close();
	}
}