package com.ArraysChapter2;

public class CopyelementsFromAToB
{
	public static void main(String args[])
	{
		int a[]=new int[] {12,56,34,23,67,76,32,75,90,345};
		int b[]=new int[a.length];
		//program to copy all the elements in ‘A’ array into ‘B’ array
//		for(int i=0;i<a.length;i++)
//		{
//			b[i]=a[i];
//		}
		
		
		//program to copy all the elements in ‘A’ array into ‘B’ array in reverse order
//		for(int i=a.length-1,j=0;i>=0;i--,j++)
//		{
//			b[j]=a[i];
//		}
		
		
		// program to copy all the even indexed elements in ‘A’ array into ‘B’ array
//		for(int i=0,j=0;i<a.length;i++)
//		{
//			if(i%2==0)
//			{
//				b[j]=a[i];
//				j++;
//			}
//		}
		
		
		// program to copy all the odd indexed elements in ‘A’ array into ‘B’ array
//		for(int i=0,j=0;i<a.length;i++)
//		{
//			if(i%2!=0)
//			{
//				b[j]=a[i];
//				j++;
//			}
//		}
		
		
		//Program to Copy the First half of the array in B array, in reverse order and print the whole array
//		for(int i=0,j=(a.length/2)-1;i<a.length;i++)
//		{
//			if(j>=0)
//			{
//				b[j]=a[i];
//				j--;
//			}
//			else
//				b[i]=a[i];
//					
//		}
		
		
		//Program Copy the Second half of the array in B array, in reverse order and print the whole array.
//		for(int i=0,j=a.length-1;i<a.length;i++)
//		{
//			if(i>=a.length/2)
//			{
//				b[j]=a[i];
//				j--;
//			}
//			else
//				b[i]=a[i];
//		}
		
		
		//Program to copy all the even elements in ‘A’ array into ‘B’ array
//		for(int i=0,j=0;i<a.length;i++)
//		{
//			if(a[i]%2==0)
//			{
//				b[j]=a[i];
//				j++;
//			}
//		}
		
		
		//Program to copy all the odd elements in ‘A’ array into ‘B’ array
//		for(int i=0,j=0;i<a.length;i++)
//		{
//			if(a[i]%2!=0)
//			{
//				b[j]=a[i];
//				j++;
//			}
//		}
		for(int i:b)
		{
			System.out.print(i+" ");
		}
	}
}
