package com.array;

public class ArraySortUsingSingleArray
{
	public static void main(String args[])
	{
		int a[]=new int[] {36,456,7,54,5,6,7};
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				i=-1;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
