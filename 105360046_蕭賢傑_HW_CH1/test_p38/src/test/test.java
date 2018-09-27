package test;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test
{
	public static void main(String[] args)throws IOException
	{
		double dnum = 160.5;

		System.out.println("身高是" + dnum + "公分");
		
		System.out.println("指定給int型態的變數");
		
		int inum = (int)dnum;

		System.out.println("身高是" + inum + "公分");
	}
}
