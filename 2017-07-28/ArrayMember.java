import java.util.Scanner;

public class ArrayMember
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int num = 0;
		String members[][] = null;
		
		while (num != 5)
		{
			switch ( (num = select()) )
			{
			case 1 :
				members = memberNum();
				break;
			case 2 :
				input(members);
				break;
			case 3 :
				find(members);
				break;
			case 4 :
				print(members);
				break;
			case 5 :
				exit();
				break;
			}
		}
	}
	
	public static int select()
	{
		System.out.println("");
		System.out.println("-----------------------------------------------");
		System.out.println("1.회원수 | 2.정보입력 | 3.회원검색 | 4.회원리스트 | 5.종료");
		System.out.println("-----------------------------------------------");
		System.out.print("선택 > ");
		
		return sc.nextInt();
	}
	
	public static String [][]memberNum()
	{
		System.out.print("회원수 > ");

		return new String[sc.nextInt()][2];
	}
	
	public static void input(String arr[][])
	{
		for (int i=0; i<arr.length; i++)
		{
			System.out.print("이름을 입력하세요 : ");
			arr[i][0] = sc.next();
			System.out.print("전화번호를 입력하세요 : ");
			arr[i][1] = sc.next();
		}
	}
	
	public static void find(String arr[][])
	{
		int i;
		String memberName;
		
		System.out.print("회원명 : ");
		memberName = sc.next();
		
		for (i=0; i<arr.length; i++)
			if (arr[i][0].equals(memberName))
				break;
		
		if (i != arr.length)
			System.out.println(arr[i][0] + " " + arr[i][1]);
		else
			System.out.println("회원이 존재하지 않습니다");
	}
	
	public static void print(String arr[][])
	{
		System.out.println("** 회원 정보 **");
		
		for (int i=0; i<arr.length; i++)
			System.out.println(arr[i][0] + " " + arr[i][1]);
	}
	
	public static void exit()
	{
		System.out.println("프로그램 종료");
	}
}