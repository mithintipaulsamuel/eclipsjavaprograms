package com.array;

public class TwoArraysMergeIntoOne 
{
	public static void main(String args[])
	{
		int a[]=new int[] {1,2,3,4,5};
		int b[]=new int[] {6,7,8,9,10};
		int totalsize=a.length+b.length;
		int c[]=new int[totalsize];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		int k=0;
		for(int i=a.length;i<totalsize;i++)
		{
			c[i]=b[k];
			k++;
			
		}
		System.out.println("Elements of A are : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Elements of B are : ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
		System.out.println("Elements of C are : ");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}
