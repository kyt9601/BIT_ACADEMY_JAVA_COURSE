
public class Sub {

	public static void main(String[] args) {
		sub();
	}

	public static void sub()
	{
		try
		{
			int arr[] = new int[10];
			int num = arr[10];
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ÃÊ°ú");
		}
	}
}
