package com.array;

public class ArrayRightRotation 
{
	public static void main(String args[])
	{
		int a[]=new int[] {20,31,12,23,190,100};
		
		//taking temp variable
//		int temp=a[a.length-1];
//		for(int i=a.length-1;i>=1;i--)
//		{
//			a[i]=a[i-1];
//		}
//		a[0]=temp;
		
		//by swapping
		for(int i=a.length-1;i>=1;i--)
		{
			int temp=a[i];
			a[i]=a[i-1];
			a[i-1]=temp;
		}
		for(int ele:a)
		{
			System.out.println(ele);
		}
	}
}
