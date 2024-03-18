package com.array;

public class TraditionalSort 
{
	public static void main(String args[])
	{
		int a[]=new int[] {50,40,30,20};
		for(int i=0;i<a.length;i++)//i=0
		{
			for(int j=i+1;j<a.length;j++)//j=1,j=2,j=3
			{
				if(a[i]>a[j]) 
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
