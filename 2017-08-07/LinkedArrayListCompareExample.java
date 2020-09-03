import java.util.*;

public class LinkedArrayListCompareExample
{
	public static void main(String[] args)
	{
		ArrayList<String> list1 = new ArrayList<String>();
		LinkedList<String> list2 = new LinkedList<String>();
		
		long start;
		long end;
		
		start = System.nanoTime();
		for (int i=0; i<10000; i++)
			list1.add(0,String.valueOf(i));
		end = System.nanoTime();
		System.out.println("ArrayList : " + (end-start) + " ns");

		start = System.nanoTime();
		for (int i=0; i<10000; i++)
			list2.add(0,String.valueOf(i));
		end = System.nanoTime();
		System.out.println("LinkedList : " + (end-start) + " ns");
	}
}