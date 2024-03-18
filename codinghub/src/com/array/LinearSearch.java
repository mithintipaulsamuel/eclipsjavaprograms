package com.array;

public class LinearSearch 
{
	public static void main(String args[])	
	{
		int a[]=new int[] {456,36,7,6,54,52,51},search=70,count=0;
		for(int i=0;i<a.length;i++)
		{
			if(search==a[i])
			{
				System.out.println("Element found");
				break;
			}
			else
				count++;
		}
		if(count==a.length)
			System.out.println("Element not found");
	}
}
