package com.string;

public class Stringrev 
{
	public static void main(String args[])
	{
		String s1="Hello all good morning";
		for(int i=(s1.length())-1;i>=0;i--)
		{
			System.out.print(s1.charAt(i));
		}
	}
}
