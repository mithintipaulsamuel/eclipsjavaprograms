package com.string;

public class AlternativeChars 
{
	public static void main(String args[])
	{
		String s1="Hello all good morning";
		System.out.println(s1);
		for(int i=0;i<s1.length();i++)
		{
			if(i%2==0)
			{
				char ch=s1.charAt(i);
				if(ch>65&&ch<90)
				{
					System.out.print((char)(ch+32)+" ");
				}
				else
				{
					System.out.print((char)(ch-32)+" ");
				}
			}
			
		}
	}
}
