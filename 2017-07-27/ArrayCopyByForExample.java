import java.util.Arrays;

public class ArrayCopyByForExample
{
	public static void main(String[] args)
	{
		Integer[] oldIntegerArray = {1, 2, 3};
		Integer[] newIntegerArray1 = new Integer[5];
		Integer[] newIntegerArray2 = new Integer[5];
		Integer[] newIntegerArray3;
		
		// 1
		for (int i=0; i<oldIntegerArray.length; i++)
			newIntegerArray1[i] = oldIntegerArray[i];
		
		for (int i=0; i<newIntegerArray1.length; i++)
			System.out.print(newIntegerArray1[i] + " ");
		System.out.print(System.lineSeparator());
		
		// 2
		System.arraycopy(oldIntegerArray, 0, newIntegerArray2, 2, oldIntegerArray.length);

		for (int i=0; i<newIntegerArray2.length; i++)
			System.out.print(newIntegerArray2[i] + " ");
		System.out.print(System.lineSeparator());
		
		// 3
		newIntegerArray3 = Arrays.copyOf(oldIntegerArray, oldIntegerArray.length);
		
		for (int i=0; i<newIntegerArray3.length; i++)
			System.out.print(newIntegerArray3[i] + " ");
		System.out.print(System.lineSeparator());
	}
}