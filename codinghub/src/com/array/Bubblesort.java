package com.array;

public class Bubblesort 
{
	public static void main(String args[])
	{
		int a[]=new int[] {20,300,5,6,31};
		System.out.print("Array elements before sort : ");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]<a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.print("Array elements after sort : ");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
