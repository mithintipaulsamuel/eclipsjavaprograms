package com.Conversion;

public class SumOfDigitsInAString 
{
	public static void main(String ags[])
	{
		String s1="a1b2c3";
		String s2="123";
		int number=Integer.parseInt(s2);
		System.out.println(number+1);
		int sum=0;
		char[] a=s1.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='0' && a[i]<='9')
			{
				sum=sum+Character.getNumericValue(a[i]);
			}
		}
		System.out.println("sum of the digits in a String = "+sum);
	}
}
