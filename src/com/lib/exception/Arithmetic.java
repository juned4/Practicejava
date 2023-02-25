package com.lib.exception;

public class Arithmetic 
{
	static void number(int a)
	{
		int res=100/a;
		System.out.println(res);
	}
	public static void main(String[] args) {
		number(2);
		number(3);
		number(0);
		number(4);

	}

}
