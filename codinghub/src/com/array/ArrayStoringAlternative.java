package com.array;

public class ArrayStoringAlternative 
{
	public static void main(String args[])
	{
		int a[]=new int[] {1,3,5,7,9};
		int b[]=new int[] {2,4,6,8,10};
		int c[]=new int[a.length+b.length];
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			c[temp]=a[i];
			temp++;
			c[temp]=b[i];
			temp++;
		}
		for(int ele:c)
		{
			System.out.println(ele);
		}
	}
}
