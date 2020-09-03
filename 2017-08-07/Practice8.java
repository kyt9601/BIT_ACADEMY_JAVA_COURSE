import java.util.*;

public class Practice8
{
	public static void main(String[] args)
	{
		Set<Student> set = new HashSet<Student>();
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<3; i++)
		{
			System.out.print("�й� : ");
			int studentNum = sc.nextInt(); sc.nextLine();
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			
			set.add(new Student(studentNum,name));
		}
		
		Iterator <Student> itr = set.iterator();
		
		while (itr.hasNext())
		{
			Student student = itr.next();
			System.out.println(student.studentNum + " : " + student.name);
		}
	}
}