import java.io.*;

public class SystemInExample1
{
	public static void main(String[] args) throws Exception
	{
		InputStream is = System.in;
		
		while (true)
		{
			char inputChar = (char)is.read();
			switch (inputChar)
			{
				default : System.out.println(inputChar);
			}
		}
	}
}