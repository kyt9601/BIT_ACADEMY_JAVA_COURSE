import java.util.Scanner;

public class ForEach
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기는 : ");
		String arr[] = new String[sc.nextInt()];
		
		System.out.println("배열에 저장할 문자열을 입력하세요 : ");
		for (Integer i=0; i<arr.length; i++)
			arr[i] = sc.next();
		
		for (String str : arr)
			System.out.println(str);
		
		sc.close();
	}
}