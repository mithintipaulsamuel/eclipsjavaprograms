package com.array;

public class SelectionSortAsc
{
	public static void main(String args[])
	{
		int a[]=new int[] {456,6,34,54,36,7,5,12,0,23,1,5};
		                 // m
//        int count=0;
		for(int i=0;i<a.length;i++)
		{
			int min=i;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[min]>a[j])
					{
						min=j;
					}
//					count++;
				}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
//		System.out.println(count);
	}
}
