package com.array;

public class SelectionSortByMyOwn 
{
	public static void main(String args[])
	{
		int a[]=new int[]{12,19,2,16};
		int min=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[min]>a[j])
				{
					min=j;
				}
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int ele:a)
		{
			System.out.println(ele);
		}
	}
}
