import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� : ");
		String str = sc.nextLine(); 
		StringTokenizer st = new StringTokenizer(str," ");
		
		System.out.println(System.lineSeparator() + "�и��� ��ū");
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());
		
		st = new StringTokenizer(str," ");
		String arr[] = new String[st.countTokens()];
		System.out.println("��ū�� : " + arr.length);
		
		for (int i=0; i<arr.length; i++)
			arr[i] = st.nextToken();
		
		System.out.println("* ������");
		for (int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
		
		Arrays.sort(arr);
		System.out.println("");
		
		System.out.println("* ������");
		for (int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
	}

}
