package com.array;

public class ArraySortTraditionalAsc {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Traditional sorting algorithm ascending order
		int a[]=new int[] {10,1,33,20,30,40,50,60};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
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
			System.out.print(a[i]+" ");
		}

	}

}
