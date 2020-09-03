public class BreakExample
{
	public static void main(String[] args)
	{
		int num;
		
		while (true)
		{
			System.out.println( (num = Random.rand(1, 6)) );
			if (num == 6) { break; }
		}
		
		System.out.println("프로그램 종료");
	}
}