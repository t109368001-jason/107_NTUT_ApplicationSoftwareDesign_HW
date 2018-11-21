import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test
{
	public static void main(String[] args)
	{
		if(args.length != 1)
		{
			System.out.println("請指派正確的檔名");
			System.exit(1);
		}
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			
			String str;
			while((str = br.readLine()) != null)
			{
				System.out.println(str);
			}

			br.close();
		}
		catch(IOException e)
		{
			System.out.println("輸入輸出有誤");
		}
	}
}
