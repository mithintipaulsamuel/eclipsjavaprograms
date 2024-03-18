package com.string;

public class WordsInAString 
{
	public static void main(String args[])
	{
		String s1="hai hello goodmorning.";
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if((ch==' '||ch=='.'||ch==','))
			{
				count++;
			}
		}
		System.out.println("There are "+(count+1)+" words.");
	}
}
