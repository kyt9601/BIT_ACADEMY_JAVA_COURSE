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
			System.out.println("+.µ¡¼À | -.»¬¼À | *.°ö¼À | /.³ª´°¼À | q.Á¾·á");
			System.out.print("¼±ÅÃ : ");
			select = (sc.next()).charAt(0);
			
			System.out.print("Ã¹¹øÂ° Á¤¼ö : ");
			num1 = sc.nextInt();
			System.out.print("µÎ¹øÂ° Á¤¼ö : ");
			num2 = sc.nextInt();
			
			System.out.print("°á°ú : ");
			
			switch (select)
			{
			case '+' :	System.out.println(calc.add(num1,num2)); break;
			case '-' :	System.out.println(calc.sub(num1,num2)); break;
			case '*' :	System.out.println(calc.multiply(num1,num2)); break;
			case '/' :	if (num2==0)
							System.out.println("0À¸·Î ³ª´­ ¼ö ¾ø½À´Ï´Ù.");
					  	else
					  		System.out.println(calc.divide(num1,num2));
						break;
			case 'q' :	break BreakWhile;
			}
			
			System.out.println("");
		}
		
		System.out.println("ÇÁ·Î±×·¥ Á¾·á");
	}
}