package com.array;

import java.util.Arrays;

public class SecongHighestNumber 
{
	public static void main(String args[])
	{
		int a[]=new int[] {1,2,3,3,3,2,2,4,5,7,2};
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		int b[]=new int[a.length];
		Arrays.sort(a);
		for(int i=a.length-1,j=0;i>=0;i--)
		{
			b[j]=a[i];
			j++;
		}
		for(int i:b)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		int count=0;
		for(int i=0;i<b.length-1;i++)
		{
		
				if(b[i]>b[i+1])
				{
					count++;
					if(count==1)
					System.out.println("fourth highest is = "+b[i+1]);

				}

				
		}
//		
		
//		for(int i:b)
//		{
//			System.out.println(i);
//		}
	}
}
