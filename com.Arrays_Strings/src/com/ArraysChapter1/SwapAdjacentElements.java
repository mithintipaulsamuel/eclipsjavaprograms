package com.ArraysChapter1;

public class SwapAdjacentElements 
{
	public static void main(String args[])
	{
		int a[]=new int[] {12,56,34,23,67,76,32,75,90,345,100};
		System.out.println("a elements before swap :");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		if(a.length%2==0)
		{
			for(int i=0;i<a.length-1;i+=2)
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		else if(a.length%2!=0)
		{
			for(int i=0;i<a.length;i+=2)
			{
				if(i==a.length-1)
				{
					int temp=a[i];
					a[i]=a[i-1];
					a[i-1]=temp;
				}
				else
				{
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		System.out.println("a elements after swap :");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
