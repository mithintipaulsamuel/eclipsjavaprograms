package com.Strings;

public class StringtoInt
{
	public static void main(String args[])
	{
		String s1="a1b2c3d4e5f6y9";
		int sum=0;
		char[] carr=s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(Character.isDigit(ch))
			{
				sum=sum+Character.getNumericValue(s1.charAt(i));
			}
			else
			{
				continue;
			}
		}
		System.out.println(sum);
	}
}
