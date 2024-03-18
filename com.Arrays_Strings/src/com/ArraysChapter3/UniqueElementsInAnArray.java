package com.ArraysChapter3;

public class UniqueElementsInAnArray 
{
	public static void main(String args[])
	{
		int a[]=new int[] {1,3,4,5,6,5,4,3,2,1,2,3,4,5,6,5,4,3,3,8,9,10,11,12,13,14,15,16};
		System.out.print("Unique elements are : ");
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}
