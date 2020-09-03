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
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택 > ");
			
			switch( getInt() )
			{
			case 1 : scores = fStudentNum(); break;
			case 2 : inputScores(scores); break;
			case 3 : printScores(scores); break;
			case 4 : analyzeScoers(scores); break;
			case 5 : run = false; break;
			default : System.out.println("잘못 입력하셨습니다"); break;
			}
		}
		
		System.out.println("프로그램 종료");
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
		System.out.print("학생수 > ");
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
		
		System.out.println("최고 점수: " + max);
		System.out.println("평균 점수: " + ((double)sum/arr.length));
	}
}