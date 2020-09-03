import java.util.Scanner;

public class MemberTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member arr[] = new Member[3];
	
		for (int i=0; i<arr.length; i++)
		{	
			arr[i] = new Member();
			
			System.out.print("�̸� : ");
			arr[i].setName(sc.next());
			
			System.out.print("����ó : ");
			arr[i].setPhoneNo(sc.next());
		}
		System.out.println("");
		
		System.out.print("ã�� �̸� : ");
		Member m = find(arr,sc.next());
		if (m != null)
			printMember(m);
		else
			System.out.println("�������� ����");
		System.out.println("");
		
		System.out.print("ã�� �̸� : ");
		m = find(arr,sc.next());
		if (m != null)
			printMember(m);
		else
			System.out.println("�������� ����");
		System.out.println("");
	}

	public static void printMember(Member m)
	{
		System.out.println("�̸� : " + m.getName());
		System.out.println("����ó : " + m.getPhoneNo());		
	}
	
	public static void print(Member arr[])
	{
		for (int i=0; i<arr.length; i++)
			printMember(arr[i]);
	}

	public static Member find(Member arr[], String name)
	{
		int i;
		
		for (i=0; i<arr.length; i++)
			if (arr[i].getName().equals(name))
				break;
		
		if (i == arr.length)
			return null;
		else
			return arr[i];
	}
}
