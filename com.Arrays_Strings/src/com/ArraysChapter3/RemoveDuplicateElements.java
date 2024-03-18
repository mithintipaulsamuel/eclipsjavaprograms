package com.ArraysChapter3;

public class RemoveDuplicateElements
{
	public static void main(String args[])
	{
		//program to remove the duplicate elements in the array.
		int a[]=new int[] {1,3,4,5,6,5,4,3,2,1};
		System.out.print("Array elements before filter : ");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=(char)'*';
				}
			}
		}
		
	}
}
