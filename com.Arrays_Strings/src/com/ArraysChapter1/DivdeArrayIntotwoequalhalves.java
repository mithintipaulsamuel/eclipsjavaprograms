package com.ArraysChapter1;

public class DivdeArrayIntotwoequalhalves
{
	public static void main(String args[])
	{
		int a[]=new int[] {12,56,34,23,67,76,32,75,90,345};
		System.out.println("a elements :");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		//Program to Print the First half in reverse order and print the whole array
		System.out.println("first half in reverse");
		for(int i=0,j=a.length/2-1;i<a.length;i++)
		{
			if(i<a.length/2)
			{
				System.out.print(a[j]+" ");
				j--;
			}
			else
				System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("second half in reverse");
		//Program to Print the Second half in reverse order and print the whole array
		for(int i=0,j=a.length-1;i<a.length;i++)
		{
			if(i<a.length/2)
			{
				System.out.print(a[i]+" ");
			}
			if(i>=a.length/2)
			{
				System.out.print(a[j]+" ");
				j--;
			}
		}
		
		System.out.println();
	}
}
