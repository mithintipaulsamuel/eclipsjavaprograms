package com.forloop;
import java.util.Scanner;
public class TwistedPrime 
{
	public static void main(String args[])
	{
		int n,i,count=0,temp=0,rem=0,count1=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number :");
		n=s.nextInt();
		for(i=n;i>0;i/=10)
		{
			rem=i%10;
			temp=temp*10+rem;
		}
		System.out.println("temp"+temp);
		int large=n>temp?n:temp;
		for(i=2;i<=large/2;i++)
		{
			if(n%i==0)
			{
				count++;
			}
			if(temp%i==0)
			{
				count1++;
			}
		}
		if(count==0&&count1==0)
		{
			System.out.println(n+" is a twisted prime.");
		}
		else
		{
			System.out.println(n+" is not a twisted prime.");
		}
	}
}
