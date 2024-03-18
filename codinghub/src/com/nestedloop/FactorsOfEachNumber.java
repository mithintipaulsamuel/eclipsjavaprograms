package com.nestedloop;
import java.util.Scanner;
public class FactorsOfEachNumber 
{
	public static void main(String args[])
	{
		int n,temp=0,rem=0,revnum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number : ");
		n=s.nextInt();
		System.out.println("Enter number is "+n);
	    temp=n;
		while(n>0)
		{
			rem=n%10;
			revnum=revnum*10+rem;
			n=n/10;
		}
		rem=0;
		System.out.println("Reverse number is "+revnum);
		while(revnum>0)
		{
		  rem=revnum%10;
		  System.out.println(" ");
		  System.out.print("Factors of "+rem+" are : ");
		  for(int i=1;i<=rem;i++)
		  {
			  if(rem%i==0)
			  {
				  System.out.print(i+" ");
			  }
		  }
		  revnum=revnum/10;
		}
	}
}
