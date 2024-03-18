package com.nestedloop;

public class LeapYearRange 
{
	public static void main(String args[])
	{
		int count=0;
	for(int i=1855;i<=2025;i++)
	{
		
	int n=i;
	if(n%4==0&&n%100!=0||n%400==0)
	{
		count++;
		System.out.println(n);
	}
	}
	System.out.println("Leap Year Range between 1885-2025 = 7"+count);
	}
}
