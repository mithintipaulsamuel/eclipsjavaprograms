package com.ArraysChapter3;

public class DuplicateElementsWithFrequencyInArray
{
	public static void main(String args[])
	{
		//program to print the duplicate elements in array
		int a[]=new int[] {1,3,4,5,6,5,4,3,2,1,2,3,4,5,6,5,4,3,3,8,9,10,11,12,13,14,15,16};
		boolean[] b=new boolean[a.length];
		System.out.println("duplicate elements are : ");
		for(int i=0;i<a.length;i++)
		{
			if(b[i]==true)
			{
				continue;
			}
			else
			{
				int count=0;
				for(int j=0;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
						b[j]=true;
					}
				}
				if(count>1)
				{
					System.out.println(a[i]+" is a duplicate element as it is repeated for "+count+" times.");
				}
			}
		}
	}
}
