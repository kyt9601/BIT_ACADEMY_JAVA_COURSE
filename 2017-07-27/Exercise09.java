import java.util.Scanner;

public class Exercise09
{
	public static void main(String[] args)
	{
		Boolean run = true;
		Integer scores[] = null;
		
		while ( run )
		{
			System.out.println("--------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("--------------------------------------------");
			System.out.print("���� > ");
			
			switch( getInt() )
			{
			case 1 : scores = fStudentNum(); break;
			case 2 : inputScores(scores); break;
			case 3 : printScores(scores); break;
			case 4 : analyzeScoers(scores); break;
			case 5 : run = false; break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�"); break;
			}
		}
		
		System.out.println("���α׷� ����");
	}
	
	public static Integer getInt()
	{
		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();
		
		sc.close();
		return num;
	}
	
	public static Integer []fStudentNum()
	{
		System.out.print("�л��� > ");
		return new Integer[ getInt() ];
	}
	
	public static void inputScores(Integer arr[])
	{
		for (Integer i=0; i<arr.length; i++)
		{
			System.out.print("scores["+i+"] > ");
			arr[i] = getInt();
		}
	}
	
	public static void printScores(Integer arr[])
	{
		for (Integer i=0; i<arr.length; i++)
			System.out.println("scores["+i+"]: " + arr[i]);
	}
	
	public static void analyzeScoers(Integer arr[])
	{
		Integer max = arr[0];
		Integer sum = arr[0];
		for (Integer i=1; i<arr.length; i++)
		{
			sum += arr[i];
			
			if (max < arr[i])
				max = arr[i];
		}
		
		System.out.println("�ְ� ����: " + max);
		System.out.println("��� ����: " + ((double)sum/arr.length));
	}
}