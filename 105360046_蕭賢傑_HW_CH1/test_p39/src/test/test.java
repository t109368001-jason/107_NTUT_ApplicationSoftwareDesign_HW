package test;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test
{
	public static void main(String[] args)throws IOException
	{
		int d = 2;
		double pi = 3.14;
		
		System.out.println("直徑是" + d + "公分的圓");
		System.out.println("其圓周是" + (d*pi) + "公分");
		
		int num1 = 5;
		int num2 = 4;
		
		double div1 = num1 / num2;
		double div2 = (double)num1 / (double)num2;
		System.out.println("5/4等於" + div1);
		System.out.println("5/4等於" + div2);
	}
}
