package com.Strings;
import java.util.Arrays;
public class LargestSmallestWordInString 
{
	public static void main(String args[])
	{
		String s1="hai hello good morningggg good to see you all in this special day";
		String[] a=s1.split(" ");
		int n1=0,n2=0;
		String s=a[0];
			for(int i=0;i<a.length;i++)
			{
				if(s.length()<a[i].length())
					s=a[i];
			}
			System.out.println(s);
	}
}
