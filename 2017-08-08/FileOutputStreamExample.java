import java.io.*;

public class FileOutputStreamExample
{
	public static void main(String[] args) throws Exception
	{
		String fileName = "C:\\Temp\\MonitorOff-setup.jpg";
		String targetName = "C:\\Temp\\MonitorOff-setup.gif";
		
		FileInputStream fis = new FileInputStream(fileName);
		FileOutputStream fos = new FileOutputStream(targetName);
		
		int readByteNo;
		byte readBytes[] = new byte[100];
		while ( (readByteNo = fis.read(readBytes)) != -1 )
		{
			fos.write(readBytes,0,readByteNo);
		}
		
		fos.flush();
		fos.close();
		fis.close();
	}
}