package com.string;

public class AlternativeCharCases 
{
	public static void main(String ags[])
	{
		String s1="aPpLe",s2="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				ch=(char)(ch+32);
				s2=s2+ch;
			}
			else if(ch>='a'&&ch<='z')
			{
				ch=(char)(ch-32);
				s2=s2+ch;
			}
		}
		System.out.println(s2);
	}
}
