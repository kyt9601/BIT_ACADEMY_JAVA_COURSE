import java.util.*;

public class StudentComparable
{
	public static void main(String[] args)
	{
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<3; i++)
		{
			System.out.print("ют╥б : ");
			String name = sc.next();
			int no = sc.nextInt();
			int lang = sc.nextInt(), eng = sc.nextInt(), math = sc.nextInt();
			
			list.add(new Student(name,no,lang,eng,math));
		}
		
		Collections.sort(list);
		
		for (int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
	}
};