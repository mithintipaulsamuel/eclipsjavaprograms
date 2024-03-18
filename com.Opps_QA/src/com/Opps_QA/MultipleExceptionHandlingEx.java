package com.Opps_QA;
import java.util.Scanner;
public class MultipleExceptionHandlingEx 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		MultipleExceptionHandlingEx obj1=new MultipleExceptionHandlingEx();
		obj1.m1(n);
		
	}
	public void m1(int n)
	{
		int num=n;
		try
		{
			System.out.println(10/num);
		}
		catch(Exception ae)
		{
			System.out.println("Please check the denominator");
		}
	}
}
