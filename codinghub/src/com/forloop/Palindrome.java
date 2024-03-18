package com.forloop;
import java.util.Scanner;
public class Palindrome 
{
	public static void main(String args[])
	{
		int n,rem=0,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		n=s.nextInt();
		for(int i=n;i>0;i=i/10)
		{
			rem=i%10;
			sum=sum*10+rem;
		}
		if(sum==n)
		{
			System.out.println(n+" is a palindrome.");
		}
		else
		{
			System.out.println(n+" is not a palindrome.");
		}
	}
}
