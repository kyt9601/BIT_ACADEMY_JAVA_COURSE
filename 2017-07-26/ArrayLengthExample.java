/*public class ArrayLengthExample
{
	public static void main(String[] args)
	{
		Integer scores[] = {83, 90, 87};
		Integer sum = 0;
		
		for (Integer i=0; i<scores.length; i++)
			sum += scores[i];
		
		System.out.println("���� : " + sum);
		System.out.printf("��� : %.4g%s", (double)sum/scores.length, System.lineSeparator());
	}
}
*/
//public class MainStringArrayArgument
public class ArrayLengthExample
{
	public static void main(String args[])
	{
		if (args.length != 2)
		{
			System.out.println("���α׷��� ����");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);
		}
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int result = num1 + num2;
		
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}