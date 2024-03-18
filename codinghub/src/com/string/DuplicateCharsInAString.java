package com.string;

public class DuplicateCharsInAString
{
	public static void main(String args[])
	{
		String s1="Happy Birthday to you.";
		boolean b[]=new boolean[s1.length()];
		for(int i=0;i<s1.length();i++)
		{
			if(b[i]==true)
			{
				continue;
			}
			int count=0;
			for(int j=0;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					count++;
					b[j]=true;
				}
			}
			System.out.println("There are "+count+" "+s1.charAt(i)+"'s.");
		}
	}
}
