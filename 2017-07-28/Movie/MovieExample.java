package Movie;

import java.util.Scanner;

public class MovieExample
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도와 영화제목을 입력하세요 : ");
		(new Movie(sc.nextInt(),sc.nextLine())).print();
	}
}