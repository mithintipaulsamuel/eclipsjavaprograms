package com.ArraysChapter3;

public class MinimumAndMaximumElement 
{
	public static void main(String args[])
	{
		int a[]=new int[] {12,56,34,23,11,67,76,32,75,90,345,6};
		int min=a[0],max=a[0];
		//code to get minimum value
		for(int i=0;i<a.length-1;i++)
		{
			if(min>a[i+1])
			{
				int temp=min;
				min=a[i+1];
				a[i+1]=temp;
			}
			if(max<a[i+1])
			{
				int temp=max;
				max=a[i+1];
				a[i+1]=max;
				a[i+1]=temp;
			}
		}
		System.out.println("Minimum element in an array = "+min);
		System.out.println("Maximum element in an array = "+max);
	}
}
