import java.util.Calendar;

public class EnumWeekExample
{
	public static void main(String[] args)
	{
		Week today = null;
		Calendar cal = Calendar.getInstance();
		Integer week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch (week)
		{
		case 0 : today = Week.MONDAY; break;
		case 1 : today = Week.TUESDAY; break;
		case 2 : today = Week.WEDNESDAY; break;
		case 3 : today = Week.THURSDAY; break;
		case 4 : today = Week.FRIDAY; break;
		case 5 : today = Week.SATURDAY; break;
		case 6 : today = Week.SUNDAY; break;
		}
		
		System.out.println("���� ����: " + today);
		
		if (today == Week.SUNDAY)
			System.out.println("�Ͽ��Ͽ��� �౸�� �մϴ�.");
		else
			System.out.println("������ �ڹ� �����մϴ�.");
	}
}