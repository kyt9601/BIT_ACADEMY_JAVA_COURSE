public class Exercise
{
	public static void main(String[] args)
	{
		Integer array[][] = {	{95, 86},
							{83, 92, 96},
							{78, 83, 93, 87, 88}};

		System.out.println("sum: " + sum(array));
		System.out.println("avg: " + avg(array));
	}
	
	public static Integer sum(Integer array[][])
	{
		Integer sum = 0;
		
		for (Integer []arr : array)
			for (Integer element : arr)
				sum += element;
		
		return sum;
	}
	
	public static Double avg(Integer array[][])
	{
		Integer count = 0;
		
		for (Integer []arr : array)
			for (Integer element : arr)
				count++;
		
		return (double)sum(array) / count;
	}
}