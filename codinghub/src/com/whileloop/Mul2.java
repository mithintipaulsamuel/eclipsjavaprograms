package com.whileloop;
import java.util.Scanner;
public class Mul2 
{
	public static void main(String args[])
	{
		long n=234786521,r=0,max=0;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			if(r>max)
			{
				max=r;
			}			
		}
		System.out.println("Largest digit among the given number is : "+max);
	}
}
