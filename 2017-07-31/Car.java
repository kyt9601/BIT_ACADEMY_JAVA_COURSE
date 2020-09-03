/*public class Car
{
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(){}
	
	Car(String model)
	{
		this.model = model;
	}
	
	Car(String model, String color)
	{
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed)
	{
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}*/
/*
public class Car
{
	private String color = "red";
	private int speed = 0;
	private int gear = 1;
	
	Car() {}
	
	public void print()
	{
		System.out.println("color : " + color);
		System.out.println("speed: " + speed);
		System.out.println("gear : " + gear);
	}
}*/

public class Car
{
	String model;
	int speed;
	
	Car(String model)
	{
		this.model = model;
	}
	
	void setSpeed(int speed)
	{
		this.speed = speed;
	}
	
	void run()
	{
		for (int i=0; i<=50; i+=10)
		{
			setSpeed(i);
			System.out.println(model + "가 달립니다. (시속 : " + speed + "km/h)");
		}
	}
}