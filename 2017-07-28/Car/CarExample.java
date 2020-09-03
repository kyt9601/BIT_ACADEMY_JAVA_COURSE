package Car;

public class CarExample
{
	public static void main(String[] args)
	{
		Car myCar = new Car();
		
		System.err.println("제작 회사 : " + myCar.company);
		System.err.println("모델명 : " + myCar.model);
		System.err.println("색상 : " + myCar.color);
		System.err.println("최고 속도 : " + myCar.maxSpeed);
		System.err.println("현재 속도 : " + myCar.speed);
		
		myCar.speed = 60;
		System.err.println("수정된 속도 : " + myCar.speed);
	}
}