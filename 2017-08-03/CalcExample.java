import java.util.Scanner;

public class CalcExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("연산 : ");
		char op = sc.next().charAt(0);
		
		switch (op)
		{
		case '+' : System.out.println("결과 : " + (new Add()).
												input(num1,num2).
												calc()); break;
		case '-' : System.out.println("결과 : " + (new Sub()).
												input(num1,num2).
												calc()); break;
		case '*' : System.out.println("결과 : " + (new Mul()).
												input(num1,num2).
												calc()); break;
		case '/' : if (num2==0)
					{
						System.out.println("연산 불가");
					}
					else
					{
						System.out.println("결과 : " + (new Div()).
														input(num1,num2).
														calc());
					}
					break;
		}
	}

}
