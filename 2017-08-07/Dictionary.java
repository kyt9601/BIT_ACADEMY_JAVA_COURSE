import java.util.*;

public class Dictionary
{
	public static void main(String[] args)
	{
		HashMap<String, String> hashMap = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		hashMap.put("java","�ڹ�");
		hashMap.put("school","�б�");
		hashMap.put("map","����");
		
		Set<HashMap.Entry<String,String>> entrySet = hashMap.entrySet();
		
		while (true)
		{
			System.out.print("�ܾ� : ");
			String find = sc.nextLine();
			if (find.equals("quit")) break;
			boolean bFind = false;
		
			Iterator<HashMap.Entry<String,String>> entryIterator = entrySet.iterator();
			
			while (entryIterator.hasNext())
			{
				HashMap.Entry<String,String> entry = entryIterator.next();
				String word = entry.getKey();
				
				if (word.equals(find))
				{
					System.out.println("�� : " + entry.getValue());
					bFind = true;
					break;
				}
			}
			
			if (bFind != true)
				System.out.println("����");
		}
	}
}