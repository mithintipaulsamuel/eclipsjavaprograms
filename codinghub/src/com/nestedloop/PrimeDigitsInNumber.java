package com.nestedloop;
import java.util.Scanner;
public class PrimeDigitsInNumber 
{
	public static void main(String args[])
	{
		int n=345,rem=0,r=0,count=0,count1=0;
		while(n>0)
		{
			rem=0;
			r=0;
			rem=n%10;
			r=rem/2;
			while(r>=2)
			{
				if(rem%r==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(rem);
				count1++;
			}
		}
	}
}
