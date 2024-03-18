package com.array;

import java.util.Arrays;

public class ArrayBinarySearchSortDescending 
{
	public static void main(String args[])
	{
		int a[]=new int[] {36,456,7,54,51,6,7};
		int b[]=new int[a.length];
		Arrays.sort(a);//{5,6,7,7,36,54,456}
		for(int i=a.length-1,j=0;i>=0;i--,j++)
		{
			b[j]=a[i];
		}
		System.out.print("Array elements of B : ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
		int f=0,l=a.length-1,search=5,count=0;
		while(f<=l)
		{
			count++;
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
		System.out.println("count : "+count);
		
	}

}
