public class AdvancedForExample
{
	public static void main(String[] args)
	{
		 Integer scores[] = {95, 71, 84, 93, 87};
		 Integer sum = 0;
		 
		 for (Integer score : scores)
			 sum += score;
		 
		 System.out.println("Á¡¼ö ÃÑÇÕ : " + sum);
		 System.out.println("Á¡¼ö Æò±Õ : " + ((double)sum/scores.length));
	}
}