package com.ArraysChapter2;

public class EvenIndexAscOddIndexDesc 
{
	public static void main(String args[])
	{
		int a[]=new int[] {12,56,34,23,67,76,32,75,90,345};
		                 //12,34,67,32,90
		                 //56,23,76,75,345
		                 //12,345,32,76,34,75,67,56,90,23
		System.out.print("Array elements before sort : ");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		//program to print all the even indexed elements in ascending order and odd indexed elements in descending order 
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+2;j<a.length;j++)
			{
				if(i%2==0&&j%2==0)
				{
					if(a[i]>a[j])
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
				else if(i%2!=0&&j%2!=0)
				{
					if(a[i]<a[j])
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
		}
		System.out.print("Array elements before sort : ");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
