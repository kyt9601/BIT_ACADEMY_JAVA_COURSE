package Car;

public class CarExample
{
	public static void main(String[] args)
	{
		Car myCar = new Car();
		
		System.err.println("���� ȸ�� : " + myCar.company);
		System.err.println("�𵨸� : " + myCar.model);
		System.err.println("���� : " + myCar.color);
		System.err.println("�ְ� �ӵ� : " + myCar.maxSpeed);
		System.err.println("���� �ӵ� : " + myCar.speed);
		
		myCar.speed = 60;
		System.err.println("������ �ӵ� : " + myCar.speed);
	}
}