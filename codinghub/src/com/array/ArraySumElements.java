package com.array;

public class ArraySumElements 
{
	public static void main(String args[])
	{
		int a[]=new int[100];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=i+1;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"] = "+a[i]);
			sum=sum+a[i];
		}
		System.out.println("Sum of all elements in an array is : "+sum);

	}
}
