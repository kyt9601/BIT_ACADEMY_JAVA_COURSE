import java.io.*;

public class FileReaderWriter
{
	public static void main(String[] args) throws Exception
	{
		Reader reader = new FileReader("C:\\Temp\\in.txt");
		Writer writer = new FileWriter("C:\\Temp\\out.txt");
		int Char;
		
		writer.write('1');
		writer.write('.');
		writer.write(' ');
		while ( (Char = reader.read()) != -1 )
		{
			char count = '2';
			
			if ((char)Char != ' ')
			{
				System.out.print((char)Char);
				writer.write((char)Char);
			}
			
			if ((char)Char == '\n')
			{
				writer.write(count++);
				writer.write('.');
				writer.write(' ');
			}
		}
		writer.flush();
		reader.close();
		writer.close();
	}
}