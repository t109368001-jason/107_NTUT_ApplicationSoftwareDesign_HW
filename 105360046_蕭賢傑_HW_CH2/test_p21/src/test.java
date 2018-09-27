import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("請問要選擇哪條路線");
		System.out.println("請輸入Y或N");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		char ans = (res == 1)?'A':'B';

		System.out.println("選擇了" + ans + "路線");
	}
}
