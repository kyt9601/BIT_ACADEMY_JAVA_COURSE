import java.util.Scanner;

public class CalculatorExample
{	
	public static void main(String[] args)
	{
		Integer num1, num2;
		char select;
		Calculator calc = new Calculator();
		Scanner sc = new Scanner(System.in);
		
		BreakWhile :
		while (true)
		{
			System.out.println("+.���� | -.���� | *.���� | /.������ | q.����");
			System.out.print("���� : ");
			select = (sc.next()).charAt(0);
			
			System.out.print("ù��° ���� : ");
			num1 = sc.nextInt();
			System.out.print("�ι�° ���� : ");
			num2 = sc.nextInt();
			
			System.out.print("��� : ");
			
			switch (select)
			{
			case '+' :	System.out.println(calc.add(num1,num2)); break;
			case '-' :	System.out.println(calc.sub(num1,num2)); break;
			case '*' :	System.out.println(calc.multiply(num1,num2)); break;
			case '/' :	if (num2==0)
							System.out.println("0���� ���� �� �����ϴ�.");
					  	else
					  		System.out.println(calc.divide(num1,num2));
						break;
			case 'q' :	break BreakWhile;
			}
			
			System.out.println("");
		}
		
		System.out.println("���α׷� ����");
	}
}