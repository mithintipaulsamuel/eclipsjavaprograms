package com.array;

import java.util.Arrays;

public class ArrayBinarySearchSortAscending 
{
	public static void main(String args[])
	{
		int a[]=new int[] {36,456,7,54,5,6,7};
		System.out.print("Array elements of A before sort : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		Arrays.sort(a);//{5,6,7,7,36,54,456}
		System.out.print("Array elements of A after sort : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int f=0,l=a.length-1,search=5;
		while(f<=l)
		{
			int m=(f+l)/2;
			if(search==a[m])
			{
				System.out.println("Element found");
				break;
			}
			else if(search<a[m])
			{
				l=m-1;
			}
			else if(search>a[m])
			{
				f=m+1;
			}
		}
		if(f>l)
		{
			System.out.println("Element not found");
		}
		
	}
}
