package com.array;

public class ArrayOddEvenIndex
{
	public static void main(String args[])
	{
		int a[]=new int[] {10,20,30,40,50,60};
		int b[]=new int[a.length];
		for(int i=0,j=0,k=b.length/2;i<b.length;i++)
		{
			if(i%2==0)
			{
				b[j]=a[i];
				j++;
			}
//			if(i%2!=0)
			else
			{
				b[k]=a[i];
				k++;
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}

	}
}
