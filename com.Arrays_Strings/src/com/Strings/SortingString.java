package com.Strings;
import java.util.Arrays;
public class SortingString 
{
	public static void main(String args[])
	{
	
		String s1="looo 1 2 4 6 7 8  ';,', ,','  allouuu Hai all good morning",s2="",s3="";
		System.out.println(s1);
		//program to sort a string both in Ascending and Descending (use both charAt() &toCharArray())
		String[] sarr=s1.split(" ");
		Arrays.sort(sarr);
		for(int i=0,j=sarr.length-1;i<sarr.length;i++,j--)
		{
			 s2=s2+sarr[i].toString()+" ";
			 s3=s3+sarr[j].toString()+" ";
		}
		System.out.println(s2);
		System.out.println(s3);
	}
}
