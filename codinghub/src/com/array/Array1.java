package com.array;

public class Array1 
{
	 
	public static void main(String args[])
	{
		int a[]=new int[]{10,11,56,47,98,34};
		int b[]=new int[a.length];
        System.out.println("Elements in array 'A' are : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
//		System.out.println("Even number of elements in an array are :");
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]%2==0)
//				System.out.print(a[i]+" ");
//		}
//		System.out.println();
//		System.out.println("Elements in even index are : ");
//		for(int i=0;i<a.length;i++)
//		{
//			if(i%2==0)
//				System.out.print(a[i]+" ");
//		}
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
				b[i]=a[i]+2;
			else if(i%2!=0)
				b[i]=a[i]+1;
		}
		System.out.println("Elements in B are :");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		
	
	}
}
