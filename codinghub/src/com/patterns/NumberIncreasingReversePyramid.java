package com.patterns;

public class NumberIncreasingReversePyramid 
{
	public static void main(String agrs[])
	{
		int n=1;
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
