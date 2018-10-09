
public class test
{
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();

		car1.show();
		
		int number = 1234;
		double gasoline = 20.5;
		String str = "1號車";
		
		car1.setCar(number, gasoline);
		car1.setName(str);
		
		car1.show();
	}
}

class Car
{
	private int num;
	private double gas;
	private String name;

	public Car()
	{
		num = 0;
		gas = 0.0;
		name = "沒有名稱";
		System.out.println("生產了車子");
	}

	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為" + num + "，將汽油量設為" + gas);
	}

	public void setName(String nm)
	{
		name = nm;
		System.out.println("將車名設為" + nm);
	}
	
	public void show()
	{
		System.out.println("車號是" + this.num);
		System.out.println("汽油量是" + this.gas);
		System.out.println("車名是" + this.name);
	}
};