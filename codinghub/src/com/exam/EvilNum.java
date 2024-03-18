package com.exam;

public class EvilNum 
{
	public static void main(String args[])
	{
		int n=9,temp=n,square=0,r=0,sum=0;
		square=(int)(Math.pow(n,2));
		while(square>0)
		{
			r=square%10;
			sum=sum+r;
			square=square/10;
		}
		n=temp;
		if(n==sum)
		{
			System.out.println(n+" is an EVIL number.");
		}
	}
}
