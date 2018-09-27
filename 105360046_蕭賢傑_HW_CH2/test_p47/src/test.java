import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class test
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		System.out.println("請輸入五個人的分數");
		Integer test[] = new Integer[5];
		

		for(int i = 0; i < test.length; i++)
		{
			String str = br.readLine();
			test[i] = Integer.parseInt(str);
		}
		
		Arrays.sort(test, Collections.reverseOrder());
		
		for(int i = 0; i < test.length; i++)
		{
			System.out.println("第" + (i + 1) + "個人的分數是" + test[i] + "分");
		}

		System.out.println("考試人數為" + test.length + "人");
	}
}
