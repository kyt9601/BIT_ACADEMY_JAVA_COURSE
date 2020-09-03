import java.util.Scanner;

public class Array
{	/*
	public static void main(String[] args)
	{
		Integer scores[] = {83, 90 , 87};
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		
		Integer sum = 0;
		for (Integer i=0; i<3; i++)
			sum += scores[i];
		
		System.out.printf("ÃÑÇÕ : %d%s",sum,System.lineSeparator());
		System.out.printf("Æò±Õ : %.3g%s",sum/3.0,System.lineSeparator());
	}
	*/
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Integer scores[];
		scores = new Integer[] {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		
		Integer sum1 = 0;
		for (Integer i=0; i<scores.length; i++)
			sum1 += scores[i];
		System.out.printf("sum1 : %d, avg1 : %.3g%s", sum1,
								(double)sum1/scores.length, System.lineSeparator());
		
		Integer sum2 = add( new Integer[] {sc.nextInt(), sc.nextInt(), sc.nextInt()} );
		System.out.printf("sum2 : %d, avg2 : %.3g%s", sum2,
								(double)sum2/scores.length, System.lineSeparator());
	}
	
	public static Integer add(Integer scores[])
	{
		Integer sum = 0;
		for (Integer i=0; i<scores.length; i++)
			sum += scores[i];
		return sum;
	}
}