import java.util.*;

public class Dictionary
{
	public static void main(String[] args)
	{
		HashMap<String, String> hashMap = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		hashMap.put("java","자바");
		hashMap.put("school","학교");
		hashMap.put("map","지도");
		
		Set<HashMap.Entry<String,String>> entrySet = hashMap.entrySet();
		
		while (true)
		{
			System.out.print("단어 : ");
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
					System.out.println("뜻 : " + entry.getValue());
					bFind = true;
					break;
				}
			}
			
			if (bFind != true)
				System.out.println("없음");
		}
	}
}