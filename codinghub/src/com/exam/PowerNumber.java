package com.exam;

public class PowerNumber 
{
	public static void main(String args[])
	{
		int n=132,sum=0,product=1,r=0,temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			product=product*r;
			n=n/10;
		}
		n=temp;
		if(sum==product)
		{
			System.out.println(n+" is a power number");
		}
		else
		{
			System.out.println(n+" is not a power number.");
		}
	}
}
