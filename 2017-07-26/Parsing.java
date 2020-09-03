import java.util.Scanner;

public class Parsing
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str;
		
		do
		{
			System.out.print("문자열을 입력하세요 : ");
			switch ( (str = sc.nextLine()).charAt(0))
			{
			case 'a' : case 'e' :
			case 'i' : case 'o' : case 'u' :
				System.out.println("str[0] " + str.charAt(0) +
									" 모음입니다." + System.lineSeparator()); break;
			default :
				System.out.println("str[0] " + str.charAt(0) +
									" 자음입니다." + System.lineSeparator()); break;
			}
		}
		while (!str.equals("q"));

		System.out.println("프로그램 종료");
		
		sc.close();
	}
}