import java.util.Scanner;

public class ForEach
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ũ��� : ");
		String arr[] = new String[sc.nextInt()];
		
		System.out.println("�迭�� ������ ���ڿ��� �Է��ϼ��� : ");
		for (Integer i=0; i<arr.length; i++)
			arr[i] = sc.next();
		
		for (String str : arr)
			System.out.println(str);
		
		sc.close();
	}
}