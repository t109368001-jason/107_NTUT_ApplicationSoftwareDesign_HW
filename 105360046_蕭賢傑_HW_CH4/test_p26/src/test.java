
public class test
{
	public static void main(String[] args)
	{
		Car[] cars;
		cars = new Car[2];
		
		cars[0] = new Car();
		cars[1] = new RacingCar();
		
		for(int i = 0; i < cars.length; i++)
		{
			Class cl = cars[i].getClass();
			System.out.println("第" + (i + 1) + "個物件類別是" + cl);
		}
	}
}

class Car
{
	protected int num;
	protected double gas;

	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
};

class RacingCar extends Car
{
	public RacingCar()
	{
		System.out.println("生產了賽車");
	}
};