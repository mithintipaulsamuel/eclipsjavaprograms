package com.whileloop;
import java.util.Scanner;
public class Armstrong 
{
	public static void main(String args[])
	{
		int n,count=0,r=0,sum=0,count1=0;
		Scanner s =new Scanner(System.in);
		System.out.print("Enter a number");
		n=s.nextInt();//153
		int temp=n;//temp=153
		while(n>0)//153>0
		{
			count++;
			n=n/10;
		}
		n=temp;
		count1=count;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+((int)(Math.pow(r, count)));
		}
		System.out.println(sum);
		
		if(sum==temp)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not an armstrong");
		}
	}

}
