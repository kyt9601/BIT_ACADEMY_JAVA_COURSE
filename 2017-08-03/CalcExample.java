import java.util.Scanner;

public class CalcExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		System.out.print("���� : ");
		char op = sc.next().charAt(0);
		
		switch (op)
		{
		case '+' : System.out.println("��� : " + (new Add()).
												input(num1,num2).
												calc()); break;
		case '-' : System.out.println("��� : " + (new Sub()).
												input(num1,num2).
												calc()); break;
		case '*' : System.out.println("��� : " + (new Mul()).
												input(num1,num2).
												calc()); break;
		case '/' : if (num2==0)
					{
						System.out.println("���� �Ұ�");
					}
					else
					{
						System.out.println("��� : " + (new Div()).
														input(num1,num2).
														calc());
					}
					break;
		}
	}

}
