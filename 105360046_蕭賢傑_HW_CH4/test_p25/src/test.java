
public class test
{
	public static void main(String[] args)
	{
		Car car1 = new Car();
		Car car2 = new Car();
		
		Car car3;
		car3 = car1;

		System.out.println("car1與car2相同" + car1.equals(car2));
		System.out.println("car1與car3相同" + car1.equals(car3));
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
