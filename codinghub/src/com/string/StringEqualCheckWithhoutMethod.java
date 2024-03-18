package com.string;

public class StringEqualCheckWithhoutMethod 
{
	public static void main(String ags[])
	{
		String s1="Hello All";
		String s2="Hello All";
		int count=0;
		if(s1.length()==s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)==s2.charAt(i))
				{
					count++;
				}
			}
			if(count==s1.length())
			{
				System.out.println("Both are equal.");
			}
			else
				System.out.println("Not equal.");
		}
		else
			System.out.println("Not equal");
	}
}
