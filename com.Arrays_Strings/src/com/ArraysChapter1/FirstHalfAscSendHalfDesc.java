package com.ArraysChapter1;

public class FirstHalfAscSendHalfDesc 
{
	public static void main(String args[])
	{
		//Program First half in ascending order, second half in descending order
		int a[]=new int[] {12,56,34,23,67,76,32,75,90,345};
		System.out.print("Array elements before sort : ");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(i<a.length/2-1)
				{
					if(a[i]>a[j])
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
				if(i>=a.length/2)
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
		System.out.print("Array elements after sort : ");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
