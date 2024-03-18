package com.exam;

public class TechnologyNumber 
{
	public static void main(String args[])
	{
		int n=2025,temp=n,n1=0,n2=0,sum=0,square=0;
		n1=n%100;
		n2=n/100;
		sum=n1+n2;
		square=(int)(Math.pow(sum, 2));
		n=temp;
		if(n==square)
		{
			System.out.println(n+" is a Technology number");
		}
		else
		{
			System.out.println(n+" is not a Technology number");
		}
	}
}
