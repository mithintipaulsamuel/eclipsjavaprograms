package com.methods;
import java.util.Arrays;
import java.util.Random; 
public class PerfectNumberOrNot 
{
	public static void main(String args[])
	{
		int a[]=new int[] {456,6,34,54,36,7,5,12,0,23,1,5};
//		int count=0;
		System.out.print("Array before swapping:");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			int min=i;
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
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
//		System.out.println(count);
	}
}
