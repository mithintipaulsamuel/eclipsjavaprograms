package com.whileloop;
import java.util.Scanner;
public class SumOfCubesOfANumber 
{
	public static void main(String args[])
	{
		int n,r=0,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number = ");
		n=s.nextInt();
		while(n>0)
		{
		  r=n%10;
		  n=n/10;
		  System.out.println("Cube of "+r+" = "+((int)(Math.pow(r,3))));
		  sum=(int)(sum+(Math.pow(r,3)));
		}
		System.out.println("Sum of the cubes of each digit of a given number = "+sum);
	}

}
