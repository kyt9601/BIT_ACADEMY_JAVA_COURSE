import java.util.Scanner;

public class ArrayMethod
{
	public static void main(String[] args)
	{
		Integer scores[] = new Integer[6];
		
		getValues(scores);
		printArray(scores);
	}
	
	public static void getValues(Integer arr[])
	{
		Scanner sc = new Scanner(System.in);
		
		for (Integer i=0; i<arr.length; i++)
		{
			System.out.print((i+1) + "번째 점수 : ");
			arr[i] = sc.nextInt();
		}
		
		sc.close();
	}
	
	public static Integer getSum(Integer arr[])
	{
		Integer sum = 0;
		
		for (Integer element : arr)
			sum += element;
		
		return sum;
	}
	
	public static Double getAverage(Integer arr[])
	{
		return (double)getSum(arr) / arr.length;
	}
	
	public static void printArray(Integer arr[])
	{
		for (Integer element : arr)
			System.out.print(element + " ");
		System.out.println("");
		
		System.out.println("평균 : " + getAverage(arr));
	}
}