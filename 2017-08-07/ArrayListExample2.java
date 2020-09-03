import java.util.*;

public class ArrayListExample2
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<4; i++)
			list.add(sc.nextLine());
		
		for (int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
	}
}