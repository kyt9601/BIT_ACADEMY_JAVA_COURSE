public class ArrayInArrayExample
{
	public static void main(String[] args)
	{
		Integer mathScores[][] = new Integer[2][3];
		
		for (Integer i=0; i<mathScores.length; i++)
			for (Integer k=0; k<mathScores[i].length; k++)
				System.out.println("mathScores["+i+"]["+k+"]="+mathScores[i][k]);
		System.out.println("");
		
		Integer englishScores[][] = new Integer[2][];
		englishScores[0] = new Integer[2];
		englishScores[1] = new Integer[3];
		
		for (Integer i=0; i<englishScores.length; i++)
			for (Integer k=0; k<englishScores[i].length; k++)
				System.out.println("englishScores["+i+"]["+k+"]="+englishScores[i][k]);
		System.out.println("");
		
		Integer javaScores[][] = {{95, 80}, {92, 96, 80}};
		
		for (Integer i=0; i<javaScores.length; i++)
			for (Integer k=0; k<javaScores[i].length; k++)
				System.out.println("javaScores["+i+"]["+k+"]="+javaScores[i][k]);
		System.out.println("");
	}
}