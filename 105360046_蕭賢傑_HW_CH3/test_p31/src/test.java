
public class test
{
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
		car1.setCar(1234, 20.5);

		Car.showSum();
		
		Car car2;
		car2 = new Car();
		car1.setCar(4567, 30.5);
	}
}

class Car
{
	public static int sum = 0;
	private int num;
	private double gas;

	public Car()
	{
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("生產了車子");
	}

	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為" + num + "，將汽油量設為" + gas);
	}

	public static void showSum()
	{
		System.out.println("車子共有" + sum + "台");
	}
	
	public void show()
	{
		System.out.println("車號是" + this.num);
		System.out.println("汽油量是" + this.gas);
	}
};