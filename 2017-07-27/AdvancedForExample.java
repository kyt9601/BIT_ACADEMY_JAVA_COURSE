public class AdvancedForExample
{
	public static void main(String[] args)
	{
		 Integer scores[] = {95, 71, 84, 93, 87};
		 Integer sum = 0;
		 
		 for (Integer score : scores)
			 sum += score;
		 
		 System.out.println("���� ���� : " + sum);
		 System.out.println("���� ��� : " + ((double)sum/scores.length));
	}
}