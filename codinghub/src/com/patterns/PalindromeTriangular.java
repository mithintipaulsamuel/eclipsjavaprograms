package com.patterns;

public class PalindromeTriangular 
{
	public static void main(String args[])
	{		
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=(i+1);j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
