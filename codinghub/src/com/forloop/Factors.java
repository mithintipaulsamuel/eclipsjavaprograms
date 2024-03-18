package com.forloop;
import java.util.Scanner;
public class Factors 
{
	public static void main(String args[])
	{
		int n,fact;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number ");
		n=s.nextInt();
		System.out.println("Factors of "+n+" are : ");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
	}

}
