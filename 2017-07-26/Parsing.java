import java.util.Scanner;

public class Parsing
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str;
		
		do
		{
			System.out.print("���ڿ��� �Է��ϼ��� : ");
			switch ( (str = sc.nextLine()).charAt(0))
			{
			case 'a' : case 'e' :
			case 'i' : case 'o' : case 'u' :
				System.out.println("str[0] " + str.charAt(0) +
									" �����Դϴ�." + System.lineSeparator()); break;
			default :
				System.out.println("str[0] " + str.charAt(0) +
									" �����Դϴ�." + System.lineSeparator()); break;
			}
		}
		while (!str.equals("q"));

		System.out.println("���α׷� ����");
		
		sc.close();
	}
}