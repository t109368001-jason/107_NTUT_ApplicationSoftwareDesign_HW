import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test
{
	public static void main(String[] args)throws IOException
	{
		int i=1;
		do
		{
			System.out.println("第" + i + "次的迴圈");
			i++;
		}while(i <= 5);

		System.out.println("迴圈結束");
	}
}
