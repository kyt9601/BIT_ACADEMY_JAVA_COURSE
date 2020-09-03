/*public class ArrayReferenceObjectExample
{
	public static void main(String[] args)
	{
		String strArray[] = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);
		System.out.println(strArray[0].equals(strArray[2]));
	}
}*/

import java.util.Scanner;

public class ArrayReferenceObjectExample
{
	public static void main(String[] args)
	{
		Integer count = 0;
		Scanner sc = new Scanner(System.in);
		String arr[][] = new String[2][3];
		
		for (Integer i=0; i<2; i++)
			for (Integer j=0; j<3; j++)
				if ( (arr[i][j] = sc.nextLine()).equals("È«±æµ¿") )
					count++;
		
		System.out.println("ÃÑ : " + count + " ¹ø");

		sc.close();
	}
}