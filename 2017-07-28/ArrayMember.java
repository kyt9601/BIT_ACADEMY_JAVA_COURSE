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
		System.out.println("1.ȸ���� | 2.�����Է� | 3.ȸ���˻� | 4.ȸ������Ʈ | 5.����");
		System.out.println("-----------------------------------------------");
		System.out.print("���� > ");
		
		return sc.nextInt();
	}
	
	public static String [][]memberNum()
	{
		System.out.print("ȸ���� > ");

		return new String[sc.nextInt()][2];
	}
	
	public static void input(String arr[][])
	{
		for (int i=0; i<arr.length; i++)
		{
			System.out.print("�̸��� �Է��ϼ��� : ");
			arr[i][0] = sc.next();
			System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
			arr[i][1] = sc.next();
		}
	}
	
	public static void find(String arr[][])
	{
		int i;
		String memberName;
		
		System.out.print("ȸ���� : ");
		memberName = sc.next();
		
		for (i=0; i<arr.length; i++)
			if (arr[i][0].equals(memberName))
				break;
		
		if (i != arr.length)
			System.out.println(arr[i][0] + " " + arr[i][1]);
		else
			System.out.println("ȸ���� �������� �ʽ��ϴ�");
	}
	
	public static void print(String arr[][])
	{
		System.out.println("** ȸ�� ���� **");
		
		for (int i=0; i<arr.length; i++)
			System.out.println(arr[i][0] + " " + arr[i][1]);
	}
	
	public static void exit()
	{
		System.out.println("���α׷� ����");
	}
}