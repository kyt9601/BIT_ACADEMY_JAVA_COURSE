import java.util.Scanner;

public class EmployeeExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e[] = new Employee[3];
		String name;
		String tel;
		long sal;
		
		for (int i=0; i<e.length; i++)
		{
			e[i] = new Employee();
			
			System.out.print("�̸��� �Է��ϼ��� : ");
			name = sc.next();
			e[i].setName(name);
			
			System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
			tel = sc.next();
			e[i].setTel(tel);
			
			System.out.print("������ �Է��ϼ��� : ");
			sal = sc.nextLong();
			e[i].setSal(sal);
		}
		System.out.println("");
		
		print(e);
	}
	
	public static void print(Employee obj[])
	{
		for (int i=0; i<obj.length; i++)
		{
			System.out.println("name : " + obj[i].getName());
			System.out.println("tel : " + obj[i].getTel());
			System.out.println("sal : " + obj[i].getSal());
		}
	}
}
