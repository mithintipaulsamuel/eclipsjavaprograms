package com.ArraysChapter1;

public class SortbyOddnEvenIndexedAsAscDesc 
{
	public static void main(String args[])
	{
		//Program to Sort the odd indexed arrays in ascending order and even indexed arrays in descending order 
		int a[]=new int[] {12,56,34,23,67,76,32,75,90,345};
		
		//Using 2  different loops
//		for(int i=0;i<a.length;i+=2)
//		{
//			for(int j=i+2;j<a.length;j+=2)
//			{
//				if(a[i]<a[j])
//				{
//					int temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
//		for(int i=1;i<a.length;i+=2)
//		{
//			for(int j=i+2;j<a.length;j+=2)
//			{
//				if(a[i]>a[j])
//				{
//					int temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
		
		
		
		System.out.println("a elements before sort :");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			int temp=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(i%2==0&&j%2==0)
				{
					if(a[i]<a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
				if(i%2!=0&&j%2!=0)
				{
					if(a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
		}
		System.out.println("a elements after sort :");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
//
//        for(int i:a)
//        {
//        	System.out.print(i+" ");
//        }
	}
}


	
 
