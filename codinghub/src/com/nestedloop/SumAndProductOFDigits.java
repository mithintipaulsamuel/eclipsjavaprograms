package com.nestedloop;

import java.util.Scanner;

public class SumAndProductOFDigits 
{
	public static void main(String args[])
	{
		int n,i,r,sum=0,product=1;
		//Scanner s= new Scanner(System.in);
		//System.out.println("Enter a number : ");
		//n=s.nextInt();
		for(int m=1;m<=1000;m++)
		{
			n=m;
		int temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			product=product*r;
			n=n/10;
		}
		//System.out.println(sum);
		//System.out.println(product);
		if(sum==product)
		{
			System.out.println("Magic number "+temp);
		}
		sum=0;
		product=1;
		}
		
	}
}
