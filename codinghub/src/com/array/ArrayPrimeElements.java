package com.array;
import java.util.Scanner;
public class ArrayPrimeElements
{
	public static void main(String args[])
	{
		
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any 5 Elements to an array :  ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=2;j<=a[i]/2;j++)
			{
				if(a[i]%j==0)
					count++;
			}
			if(count==0&&a[i]!=1)
				System.out.println(a[i]+" is a prime number");
			else
				System.out.println(a[i]+" is not a prime number ");
		}
	}
}
