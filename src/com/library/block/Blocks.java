package com.library.block;

public class Blocks 
{
	static void arith(int a)
	{
		try
		{
			int res=500/a;
			System.out.println(res);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arith handlled");
		}
		finally
		{
			System.out.println("Finally block");
			try
			{
				int [] arr= {10,20,30};
				System.out.println(arr[a]);
			}
			catch(Exception e)
			{
				System.out.println("aaray is handlled");
			}
		}
	}
	public static void main(String[] args) {
		arith(1);
		arith(0);
		arith(2);
	}
}