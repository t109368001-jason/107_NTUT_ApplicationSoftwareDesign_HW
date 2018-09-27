package test;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("1+2单" + (1 + 2));
		System.out.println("3*4单" + (3 * 4));
		
		int num1 = 2;
		int num2 = 3;
		int sum = num1 + num2;

		System.out.println("跑计num1琌" + num1);
		System.out.println("跑计num2琌" + num2);
		System.out.println("num1+num2琌" + sum);
		
		num1 = num1 + 1;

		System.out.println("跑计num11ぇ琌" + num1);
	}
}
