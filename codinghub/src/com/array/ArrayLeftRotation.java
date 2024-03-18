package com.array;

public class ArrayLeftRotation 
{
	public static void main(String args[])
	{
		int a[]=new int[] {100,20,31,12,23,190};
		System.out.print("Before Left Rotation : ");
		for(int ele:a)
		{
			System.out.print(ele+" ");
		}
		System.out.println();
		// taking temporary variable
			int temp=a[0];
			for(int i=0;i<a.length-1;i++)
			{
				a[i]=a[i+1];
			}
			a[a.length-1]=temp;
		System.out.print("After Left Rotation using temporary variable : ");
		for(int ele:a)
		{
			System.out.print(ele+" ");
		}
		System.out.println();
		for(int k=0;k<2;k++)
		{
			int temp3=a[0];
			for(int i=0;i<a.length-1;i++)
			{
				a[i]=a[i+1];
			}
			a[a.length-1]=temp3;
		}
		System.out.print("After Left Rotation using swapping  : ");
		for(int ele:a)
		{
			System.out.print(ele+" ");
		}
		System.out.println();
		//by swapping
		for(int i=0;i<a.length-1;i++)
		{
			int temp2=a[i];
			a[i]=a[i+1];
			a[i+1]=temp2;
		}
		System.out.print("After Left Rotation : ");
		for(int ele:a)
		{
			System.out.print(ele+" ");
		}
	}
}
