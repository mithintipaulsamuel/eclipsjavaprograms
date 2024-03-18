package com.array;

public class ArrayDuplicateElements 
{
	public static void main(String args[])
	{
		int a[]=new int[] {12,0,23,1,5,12,34,56,34,56,23};
		boolean b[]=new boolean[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(b[i]==true)
			{
				continue;
			}
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					b[j]=true;
				}
			}
			if(count>1)
			{
				System.out.println(a[i]+" count = "+count);
			}
			if(count==1)
			{
				System.out.println(a[i]+" count = "+count);
			}
		}
	}
}
