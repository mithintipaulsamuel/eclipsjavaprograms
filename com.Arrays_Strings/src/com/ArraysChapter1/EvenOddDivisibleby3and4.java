package com.ArraysChapter1;

public class EvenOddDivisibleby3and4 
{
	public static void main(String args[])
	{
		int a[]=new int[] {12,56,34,23,67,76,32,75,90,345};
		System.out.print("Array a elements are : ");
		for(int i:a)
		{
				System.out.print(i+" ");
		}
		System.out.println();
		
		
		//Program to print the elements which are divisible by 4 
		System.out.print("elements which are divisible  by 4 : ");
		for(int i:a)
		{
			if(i%4==0)
				System.out.print(i+" ");
		}
		System.out.println();
		
		//Program to Print only even indexed elements
		System.out.print("even indexed elements are : ");
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
				System.out.print(a[i]+" ");
		}
		System.out.println();
		
		//Program to Print only odd indexed elements
		System.out.print("odd indexed elements are : ");
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
				System.out.print(a[i]+" ");
		}
		System.out.println();
		
		//Program to Print the indices which are divisible by 3
		System.out.print("the indices which are divisible by 3 are : ");
		for(int i=0;i<a.length;i++)
		{
			if(i%3==0)
				System.out.print(i+" ");
		}
		System.out.println();
	}
}
