package com.Conversion;

public class Palindrom 
{
	public static void main(String args[])
	{
		int n=123;
		String s="";
		//converting int to String one way
		s=s+n;
		//converting int to String another way
		String s3=String.valueOf(n);
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String s2=sb.toString();
		if(s3.equals(s2))
		{
			System.out.println(n+" is a palindrome");
		}
		else
		{
			System.out.println("Not a plaindrome");
		}
	}
}
