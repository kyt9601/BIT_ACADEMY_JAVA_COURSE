package Movie;

import java.util.Scanner;

public class MovieExample
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�⵵�� ��ȭ������ �Է��ϼ��� : ");
		(new Movie(sc.nextInt(),sc.nextLine())).print();
	}
}