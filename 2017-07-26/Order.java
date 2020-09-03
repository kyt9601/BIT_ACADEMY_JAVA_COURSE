import java.util.Scanner;

public class Order
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Integer arr[] = new Integer[3];
		Integer max, mid, min;
		
		for (Integer i=0; i<3; i++)
		{
			System.out.print(i+1 + "번째 숫자 : ");
			arr[i] = sc.nextInt();
		}
		
		/*if (arr[0]>=arr[1] && arr[0]>=arr[2] && arr[1]>=arr[2])
			System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
		else if (arr[0]>=arr[1] && arr[0]>=arr[2] && arr[1]<=arr[2])
			System.out.println(arr[0] + " " + arr[2] + " " + arr[1]);
		else if (arr[1]>=arr[0] && arr[1]>=arr[2] && arr[0]>=arr[2])
			System.out.println(arr[1] + " " + arr[0] + " " + arr[2]);
		else if (arr[1]>=arr[0] && arr[1]>=arr[2] && arr[0]<=arr[2])
			System.out.println(arr[1] + " " + arr[2] + " " + arr[0]);
		else if (arr[2]>=arr[0] && arr[2]>=arr[1] && arr[0]>=arr[1])
			System.out.println(arr[2] + " " + arr[0] + " " + arr[1]);
		else
			System.out.println(arr[2] + " " + arr[1] + " " + arr[0]);*/
		
		max = (arr[0]>=arr[1] ?
				(arr[0]>=arr[2] ? arr[0] : arr[2]) :
				(arr[1]>=arr[2] ? arr[1] : arr[2]));
		mid = (arr[0]>=arr[1] ?
				(arr[0]>=arr[2] ? arr[2] : arr[0]) :
				(arr[1]>=arr[2] ? arr[2] : arr[1]));
		min = (arr[0]>=arr[1] ?
				(arr[2]>=arr[1] ? arr[1] : arr[2]) :
				(arr[2]>=arr[0] ? arr[0] : arr[2]));
		
		System.out.println(min + " " + mid + " " + max);
		
		sc.close();
	}
}