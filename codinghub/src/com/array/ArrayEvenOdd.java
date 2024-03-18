package com.array;

import java.util.Scanner;

public class ArrayEvenOdd
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
			if(a[i]%2==0)
				System.out.println(a[i]+" is an even number");
			if(a[i]%2!=0)
				System.out.println(a[i]+" is an odd number");
		}
		
	}
}
