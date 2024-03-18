package com.array;
import java.util.Scanner;

public class ArrayMergeQ2 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array elements of size 5 : ");
		int a[]=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Array-A Elements : ");
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.println("Enter array elements of size 5 : ");
		int b[]=new int[5];
		for(int i=0;i<5;i++)
		{
			b[i]=s.nextInt();
		}
		System.out.println("Array-B Elements : ");
		for(int i=0;i<5;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
		MergeQ2 obj=new MergeQ2();
		obj.Merge(a,b);
	}
}

  class MergeQ2
{
	public void Merge(int a[],int b[])
	{
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		
		for(int i=a.length,j=b.length-1;i<c.length;i++,j--)
		{
			c[i]=b[j];
		}
		System.out.print("C-Array Elements are : ");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		
	}
}
