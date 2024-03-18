package com.ArraysChapter1;

public class SortAscending 
{
	public static void main(String args[])
	{
		int a[]=new int[] {12,56,34,23,67,76,32,75,90,345};
		System.out.print("before sorting elements are : ");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		//sorting in traditional method
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("after sorting elements using traditional method are : ");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		//sorting elements using single loop
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
		System.out.print("after sorting elements using single loop are : ");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		

	}
}
