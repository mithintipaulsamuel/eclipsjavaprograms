package com.forloop;
import java.util.Scanner;
public class FactorialSumNumber 
{
	public static void main(String args[])
	{
		int n,r,fact=1,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any integer");
		n=s.nextInt();
		for(;n>0;n=n/10)
		{
			r=n%10;
			for(;r>=1;r--)
			{
				fact=fact*r;
			}
			sum=sum+fact;
			fact=1;
		}
		System.out.println(sum);
		/*
		while(n>0)//123>0,12>0,
		{
			r=n%10;//3,2,
			while(r>=1)//3>=1,2>=1,1=1,0!>=1//
			{
				fact=fact*r;//fact=1*3=3,fact=3*2=6,fact=6*1=6
				r--;//3-1=2,2-1=1,1-1=0;
			}
			sum=sum+fact;//sum=0+6,
			n=n/10;//12,
			fact=1;
		}
		System.out.println(sum);*/
	}
}
