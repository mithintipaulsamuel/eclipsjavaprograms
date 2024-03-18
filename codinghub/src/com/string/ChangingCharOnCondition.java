package com.string;

public class ChangingCharOnCondition 
{
	public static void main(String ags[])
	{
		String s1="Hello Hi @*_$ 123";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				ch=(char)(ch+32);
			}
			else if(ch>='a'&&ch<='z')
			{
				ch=(char)(ch-32);
			}
			else if(ch==' ')
			{
				ch='!';
			}
			else if(ch>='0'&&ch<='9')
			{
				ch=s1.charAt(0);
			}
			else
			{
				ch=' ';
				
			}
			System.out.println(ch);
		}
	}
}
