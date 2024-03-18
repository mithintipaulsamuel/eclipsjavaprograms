package com.array;

public class Arraypreviousandaftersum 
{
	public static void main(String args[])
	{
		int a[]=new int[] {1,2,3,4,5};
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(i==0)
				b[i]=a[i]+a[i+1];
			if(i==a.length-1)
				b[i]=a[i]+a[i-1];
			if(i!=0&&i!=a.length-1)
				b[i]=a[i-1]+a[i+1];
		}
		System.out.println("Elements in A are:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Elements in B are:");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}
