package com.nestedloop;

public class PrimeRange 
{
	public static void main(String args[])
	{
		int count1=0;
		System.out.println("Prime numbers between 1 and 100");
		for(int j=2;j<=1000;j++)//range
		{
		int n=j,i=n/2,count=0;
		while(i>=2)
		{
		  if(n%i==0)
		  {
			  count++;
		  }
		  i--;
		}
		if(count==0)
		{
			count1++;
			System.out.println(n);
		}
		}
		System.out.println(count1++);
	}
}
