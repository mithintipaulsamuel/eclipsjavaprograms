package com.string;
import java.util.Arrays;
public class StringUsingSplit
{
	public static void main(String args[])
	{
//		String  s1=new String ("MALAYALAM TEACHES ARORA kayak deified rotator repaper deed peep wow noon ");
//		String array[]=s1.split(" ");
//		int count=0;
//		for(int i=0;i<array.length;i++)
//		{
//			String s=array[i];
//			String rev="";
//			for(int j=s.length()-1;j>=0;j--)
//			{
//				rev=rev+s.charAt(j);
//			}
//			if(s.equals(rev))
//			{
//				count++;
//			}
//		}
//		System.out.println("There are "+count+" palindromes.");
		
		int mincount=0;
		String s1="Hello all good morning";
		String[] a=s1.split(s1);//{"hello",}
		for(int i=0;i<a.length;i++)
		{
			String subs=a[i];
			int count=0;
			for(int j=0;j<subs.length();j++)
			{
				char ch=subs.charAt(j);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				{
					count++;
				}				
			}
			System.out.println("There are "+count+" vowels in "+(subs));
		}
		
		
	}
}

