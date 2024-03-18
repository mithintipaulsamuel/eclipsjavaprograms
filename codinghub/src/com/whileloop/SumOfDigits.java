package com.whileloop;
import java.util.Scanner;
public class SumOfDigits 
{
	public static void main(String args[])
	{
		int n,r=0,q=0,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number : ");
		n=s.nextInt();
		while(n!=0)
		{
			r=n%10;
			n=n/10;
			sum=sum+r;
		}
		System.out.println(sum);
	}

}
